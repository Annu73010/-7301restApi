# -7301restApi

I have made two entities that are User and Email enitites.
In User table , i need to save all of its attributes like user-emailId,user-firstname,user-lastname.
In Email table, i need to save their details like entering emails and by which user-id.
By using user-id in email table, help us to retreive all the number of mails sent by a particular mail-id.
In this Rest Api, I made service layer for writing business logic and to interact with repository interface.
Repository interface , i used to you know for saving or fetching the data to or from database basically to communicate with DB.
I made controller layer for handling the users incoming requests in which one important request is to fetch all emails sent by a particular email using userID.
