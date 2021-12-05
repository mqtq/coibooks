# coibooks
simple rest api allowing for getting list of books 

##Book list methods
all metods below return list of books

###get ("/books") 
returns list of all books in application

###get ("/books/isbn/{isbn}") 
returns list of books which contains specified part of isbn which is put as part of url in place of {isbn}

###get ("/books/nazwa/{nazwa}") 
returns list of books which contains specified part of title which is provided as part of url in plce of {nazwa}

##Return values of api
###Build of return JSON
Whole value is return as array of books.

Every book consist of "tytul" (title), "autor" (author) and "isbn" (numer ISBN of book)


## Examples

### getting all books
url: http://localhost:8080/books

answer: [{"tytul":"tytul1","autor":"author1","isbn":"9782123456803"},{"tytul":"tytul2","autor":"author2","isbn":"9782123456804"},{"tytul":"tytul3","autor":"author3","isbn":"9782123456905"},{"tytul":"title1","autor":"author4","isbn":"9782123456906"}]

### getting books by part of title

url: http://localhost:8080/books/nazwa/tit

answer: [{"tytul":"title1","autor":"author4","isbn":"9782123456906"}]

### getting books by part of ISBN
url: http://localhost:8080/books/isbn/45680

answer : [{"tytul":"tytul1","autor":"author1","isbn":"9782123456803"},{"tytul":"tytul2","autor":"author2","isbn":"9782123456804"}]