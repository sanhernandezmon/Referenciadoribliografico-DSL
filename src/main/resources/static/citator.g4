grammar citator;

reference: lenguaje citations;
lenguaje: LENGUAJEKEY LENGUAJEOPTION;
citations: citation citations? | EOF | ;
citation: CITATIONKEY '{'citationType authorName authorLastName citationTitle? publicationDate? consultDate? resume? city? editorial? website? article?'}';


citationType: CITATIONTYPEKEY CITATIONTYPE SEMICOLOM;
authorName: AUTHORNAMEKEY ID SEMICOLOM;
authorLastName: AUTHORLASTNAMEKEY ID SEMICOLOM;
citationTitle: TITLEKEY ID SEMICOLOM;
website: WEBSITEKEY ID ID SEMICOLOM;
publicationDate: PUBLICATIONDATEKEY date SEMICOLOM;
consultDate:CONSULTDATEKEY date SEMICOLOM;
article: ARTICLEKEY '(' ID ', ' ID ', ' ID ')' SEMICOLOM;
city: CITYKEY ID SEMICOLOM;
editorial: EDITORIALKEY ID SEMICOLOM;
resume:RESUMEKEY '"' RESUMETEXT '"' SEMICOLOM;
date : DAY SEPARATOR month SEPARATOR YEAR
    | DAY SEPARATOR MONTH SEPARATOR YEAR;
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


ID: [a-zA-Z][a-zA-Z0-9_]{2,40};
RESUMETEXT        : [a-zA-Z][a-zA-Z0-9_]* ;


DIGIT : [0-9];
FIRSTMONTHDIGIT: [0|1];
FIRSTDAYDIGIT: [0|1|2|3];

YEAR : DIGIT DIGIT DIGIT DIGIT;
DAY : FIRSTDAYDIGIT DIGIT;
MONTH: FIRSTMONTHDIGIT DIGIT;

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

SEPARATOR : [/\\\-] ;
