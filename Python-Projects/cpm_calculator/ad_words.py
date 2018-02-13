import json
import firebase
from firebase import jsonutil

# Declare database variable.
firebase = firebase.FirebaseApplication('Put firebase app id here', None)

# Fetch advertisement categories from Firebase.
firebase_categories = firebase.get('/advertisement_categories/', None)
categories = {}
subcategories = {}

# Sort and list categories.
for index, item in sorted(firebase_categories.iteritems()):
    categories[int(index)] = item

# Sort categories and subcategories by code
sorted_categories = sorted(categories, reverse = False)

# Function to get the desired category/subcategory combination.
def retrieveDesiredCategory():
    print "\nCategories"
    for index, value in enumerate(sorted_categories):
        print ("{} : {}".format(value, categories[value]))

    print ""
    code = input('Enter a category code: ')
    print ""

    if code >= 1000 and code <= 9999:
        retrieveSubcategoriesFromCategory(code)
    else:
        print "Code input error!\n"

# Function to get all of the subcategories by code
def retrieveSubcategoriesFromCategory(code):

    firebase_subcategories = firebase.get('/advertisement_subcategories/' + str(code), None)

    if firebase_subcategories:
        for index, item in sorted(firebase_subcategories.iteritems()):
            subcategories[int(index)] = item

        sorted_subcategories = sorted(subcategories, reverse = False)

        print "Subcategories for ", categories[code]

        for index, value in enumerate(sorted_subcategories):
            print ("{} : {}".format(value, subcategories[value]))
        print ""
    else:
        print "No subcategories exist for this category yet!\n"

retrieveDesiredCategory()
