# coibooks
simple rest api allowing for getting list of books 

##Book list
all metods below return list of books:

###get ("/books") 
returns list of all books in application

###get ("/books/isbn/{isbn}") 
returns list of books which contains specified part of isbn which is put as part of url in place of {isbn}

###get ("/books/nazwa/{nazwa}") 
returns list of books which contains specified part of title which is provided as part of url in plce of {nazwa}

