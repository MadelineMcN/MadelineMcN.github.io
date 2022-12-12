from pymongo import MongoClient # this import allows to connect to our mongodb database
from bson.objectid import ObjectId #query using an ObjectID
from bson.json_util import dumps

class rentalListings(object):
    """CRUD operations for Sample AirBnB Dataset in MongoDB"""
    
    # These Modules are intended to be used with the same airbnb
    # dataset provided by Atlas. When connected to the dashboard file
    # "rentalListingInterface.ipynb", the dataset can be acces and modified accordingly

    def __init__(self, username, password):  # provide default values for object
        # Initializing the MongoClient. This helps to
        # access the MongoDB databases and collections.
        self.client = MongoClient('mongodb://%s:%s@localhost:37193/AAC' % (username, password))
        self.database = self.client["sample_airbnb"]

    # Allows Authorized user to add a listing to AirBnB database
    def create(self, data):
        if data is not None:
            insert_dictionary = self.database.listingsAndReviews.insert_one(
                data
            )  # data should be dictionary
            if insert_dictionary != 0:
                return True
            else:
                return False
        else:
            raise Exception("Nothing to save, because data parameter is empty")

    ## Allows Authorized user to search a specific listing to AirBnB database via listing id
    def read(self, search_crit=None):  # default search criteria is empty
        if search_crit:  # search if criteria exists
            listings_query = self.database.listingsAndReviewsfind(
                search_crit, {"_id": False}
            )  # return all documents matching search critera, omitting ID of each document
        else:  # return all documents if no criteria exists
            listings_query = self.database.listingsAndReviews.find({}, {"_id": False})
            
        return listings_query
    
    # # Allows Authorized user to modify a  listing to AirBnB database
    def update(self, save):
        if save is not None:
            if save:
                result = self.database.listingsAndReviews.insert_one(save)
            return result;
        else:
            raise Exception("Nothing to update, save is empty")
            
    
    # # Allows Authorized user to delete a listing to AirBnB database
    def delete(self, remove):
        if remove is not None:
            if remove:
                result = self.database.listingsAndReviews.delete_one(remove)
        else:
            raise Exception("Nothing to delete, remove is empty")
