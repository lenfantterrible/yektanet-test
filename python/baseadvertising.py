#!/usr/bin/python3 

class BaseAdvertising():

    _clicks = 0 
    _views = 0 
    
    def __init__(self, id) -> None:
        self._id = id 

    def getId(self):
        return self._id 

    def setId(self, id):
        self._id = id

    def getClicks(self):
        return self._clicks 

    def incClicks(self):
        self._clicks += 1 

    def getViews(self): 
        return self._views 

    def incViews(self):
        self._views += 1

    @staticmethod 
    def describeMe():
        return "Class BaseAdvertising"