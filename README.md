# android-mock-http-server

##Use this version only if you are facing dependency problems with AndroidJunitRunner and Kristofa's mock-http-server.

A AndroidJunitRunner compatible version of kristofa's mock-http-server.

###TODO

-For now, requests only matches if the expected request object (key of a map) and the actual request object are exactly the same. 
	-A solution is to replace the key to be the URL path.

-Implement respondAlways method on SimpleHttpResponseProvider such that for a given request all responses will be the same.

-Capability to read .json files (test scenario) on Resource folders and use them as mock responses.

-Remove original mock-http-server classes that are not usefull to us.


