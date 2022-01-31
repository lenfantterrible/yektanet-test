#!/usr/bin/python3 
from baseadvertising import BaseAdvertising

class AD(BaseAdvertising):

    def __init__(self, id, title, imgUrl, link, advertiser):
        super().__init__(id)
        self._title = title
        self._imgUrl = imgUrl
        self._link = link
        self._advertiser = advertiser

    def gettTitle(self):
        return self._title 

    def setTitle(self, title):
        self._title = title

    def getImgUrl(self):
        return self._imgUrl

    def setImgUrl(self, imgUrl):
        self._imgUrl = imgUrl

    def getlink(self):
        return self._link 

    def setlink(self, link):
        self._link = link

    def getAdvertiser(self):
        return self._advertiser 

    def setAdvertiser(self, adv):
        self._advertiser = adv     
    
    def incClicks(self):
        self._advertiser.incClicks()
        super().incClicks()

    def incViews(self):
        self._advertiser.incViews() 
        super().incViews()

    @staticmethod
    def describeMe():
        return "Ad Class Represents The Entity of Ad"
