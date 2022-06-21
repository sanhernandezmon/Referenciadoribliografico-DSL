grammar citator;

reference: lenguaje citations;
lenguaje: LENGUAJEKEY LENGUAJEOPTION SEMICOLOM;
citations: citation citations? | EOF | ;
citation: CITATIONKEY '{'citationType authorName authorLastName citationTitle? publicationDate? consultDate? city? editorial? website? article?'}';


citationType: CITATIONTYPEKEY CITATIONTYPE SEMICOLOM;
authorName: AUTHORNAMEKEY ID ID? SEMICOLOM;
authorLastName: AUTHORLASTNAMEKEY ID ID? SEMICOLOM;
citationTitle: TITLEKEY STRING SEMICOLOM;
website: WEBSITEKEY STRING STRING SEMICOLOM;
publicationDate: PUBLICATIONDATEKEY date SEMICOLOM;
consultDate:CONSULTDATEKEY date SEMICOLOM;
article: ARTICLEKEY '(' ID ', ' ID ', ' ID ')' SEMICOLOM;
city: CITYKEY ID SEMICOLOM;
editorial: EDITORIALKEY STRING SEMICOLOM;
date : DAY SEPARATOR month SEPARATOR YEAR;
month : JAN | FEB | MAR | APR | MAY | JUN | JUL | AUG | SEP | OCT | NOV | DEC ;


WS     : [ \t\r\n]+ -> skip ;
SEMICOLOM: ';';
LENGUAJEKEY: 'Lenguaje';
LENGUAJEOPTION: 'SPANISH' | 'ENGLISH';
CITATIONKEY: 'resource';
CITATIONTYPEKEY: 'type';
CITATIONTYPE: 'article' | 'website' | 'book';
AUTHORLASTNAMEKEY: 'last_name';
AUTHORNAMEKEY: 'name';
TITLEKEY: 'title';
PUBLICATIONDATEKEY: 'published_on';
CONSULTDATEKEY: 'consuled_on';
RESUMEKEY: 'resume';
CITYKEY: 'city';
EDITORIALKEY: 'editorial';
WEBSITEKEY: 'website_definition';
ARTICLEKEY: 'article_definition';

JAN : [Jj][Aa][Nn] ;
FEB : [Ff][Ee][Bb] ;
MAR : [Mm][Aa][Rr] ;
APR : [Aa][Pp][Rr] ;
MAY : [Mm][Aa][Yy] ;
JUN : [Jj][Uu][Nn] ;
JUL : [Jj][Uu][Ll] ;
AUG : [Aa][Uu][Gg] ;
SEP : [Ss][Ee][Pp] ;
OCT : [Oo][Cc][Tt] ;
NOV : [Nn][Oo][Vv] ;
DEC : [Dd][Ee][Cc] ;

ID: [a-zA-ZñÑ][a-zA-ZñÑ0-9_]*;
STRING: '"' ( ESC | ~[\\"\r\n] )* '"';
fragment ESC : '\\"' | '\\\\' ;


DIGIT : [0-9];
FIRSTMONTHDIGIT: [0|1];
FIRSTDAYDIGIT: [0|1|2|3];

YEAR : DIGIT DIGIT DIGIT DIGIT;
DAY : FIRSTDAYDIGIT DIGIT;
MONTH: FIRSTMONTHDIGIT DIGIT;



SEPARATOR : [/\\\-] ;
