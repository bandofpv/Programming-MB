#!/usr/bin/env python

#The Hangman Game

import random #importing the random liabrary

words = ['fish', 'dog', 'cat', 'cow', 'pig', 'monkey']
lives = 15
guessed_letters = ''
            

def welcome(): #creating the welcome function
    print('Welcome to the Hangman Game by Andrew Bernas!') #print a welcome message
    print('I am thinking of an animal...') #print message

def pick_word(): #creating the pick_word function
    return random.choice(words); #return a random word

def remaining_lives():
     print('Lives remaining: ' + str(lives))  #print the remaing lives

def get_guess(word): #creating the guess word function
    display(word) #display the used up letters
    guess = raw_input('Enter a letter or word:') #create guess to the use raw input
    return guess #return the input

def display(word):
    display_word = ''
    for letter in word:
        if guessed_letters.find(letter) > -1:
            display_word = display_word + letter

        else:
            display_word = display_word + '-'

    print(display_word)

def whole_word_guess(guess, word):
    global lives
    if guess.lower() == word.lower():
        return True
    else:
        lives = lives - 1
        return False

def single_word_guess(guess, word):
    global lives
    global guessed_letters
    if word.find(guess) == -1:
        lives = lives - 1
    guessed_letters = guessed_letters + guess.lower()
    if all_done(word):
        return True
    return False

def all_done(word):
    for letter in word:
        if guessed_letters.find(letter.lower()) == -1:
            return False
    return True

def use_guess(guess, word):
    if len(guess) > 1:
        return whole_word_guess(guess, word)
    else:
        return single_word_guess(guess, word)

def game(): 
    welcome() #run the welcome message
    word = pick_word() #randomly choose a word from words list
    e = 'exit'
    while True:
        guess = get_guess(word).lower()
        if e == guess:
            break
        if use_guess(guess, word):
            print('Well done!!! You beat the game!!!')
            break
        if lives == 0:
            print('You Died!!!')
            break

game()


