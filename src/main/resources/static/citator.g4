grammar citator;

reference: lenguaje citations;
lenguaje: LENGUAJEKEY LENGUAJEOPTION;
citations: citation citations? | EOF | ;
citation: CITATIONKEY '{'citationType authorName authorLastName citationTitle? publicationDate? consultDate? resume? '}';
citationType: CITATIONTYPEKEY CITATIONTYPE SEMICOLOM;
authorName: AUTHORNAMEKEY AUTHORNAME SEMICOLOM;
authorLastName: AUTHORLASTNAMEKEY AUTHORLASTNAME SEMICOLOM;
citationTitle: TITLEKEY TITLE SEMICOLOM;
publicationDate: PUBLICATIONDATEKEY date SEMICOLOM;
consultDate:CONSULTDATEKEY date SEMICOLOM;
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
CITATIONTYPE: 'article' | 'image' | 'website' | 'book';
AUTHORLASTNAMEKEY: 'last_name';
AUTHORNAMEKEY: 'name';
TITLEKEY: 'title';
PUBLICATIONDATEKEY: 'published_on';
CONSULTDATEKEY: 'consuled_on';
RESUMEKEY: 'resume';

AUTHORNAME        : [a-zA-Z][a-zA-Z0-9_]{2,20} ;
AUTHORLASTNAME        : [a-zA-Z][a-zA-Z0-9_]{2,20} ;
TITLE: [a-zA-Z][a-zA-Z0-9_]{2,40};
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
