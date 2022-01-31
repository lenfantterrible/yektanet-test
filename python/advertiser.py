#!/usr/bin/python3 
from baseadvertising import BaseAdvertising 

class Advertiser(BaseAdvertising):

    _totalClicks = 0

    def __init__(self, id, name):
        super().__init__(id)
        self._name = name 

    def getName(self):
        return self._name 

    def setName(self, name):
        self._name = name

    @staticmethod
    def help():
        return "Advertiser\nID:\tID of Advertiser\nName:\tName of Advertiser\nClicks:\tNumber of clicks of this Advertiser\nViews: Number of views of this Advertiser"
    
    @staticmethod
    def describeMe():
        return "Advertiser Class Represents The Entity of Advertiser"

    def incClicks(self):
        Advertiser._totalClicks += 1
        super().incClicks()

    def getTotalClicks():
        return Advertiser._totalClicks
    
