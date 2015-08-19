grammar g1;

options {
  language = Java;
}
@header {
  package test;
}


@lexer::header {
  package test;
}
sent: prindefinite 
	|  prcontinous 	
	|  findefinite 
	|  fcontinous
	| pt
;
findefinite:AUXILIARY3  NOUN VERB NOUN QUESTMARK;
prindefinite:  AUXILIARY1  NOUN VERB NOUN QUESTMARK;
prcontinous: AUXILIARY2  NOUN VERB  NOUN QUESTMARK;
fcontinous:AUXILIARY3  NOUN 'be' VERB NOUN QUESTMARK;
pt: NOUN VERB NOUN AUXILIARY1 NOUN;
AUXILIARY1: ('do'|'does');
AUXILIARY2: ('are'|'is'|'am');
AUXILIARY3: ('will'|'shall');
NOUN:('you'|'me'|'they'|'we'|'he'|'she'|'us'|'food'|'there'|'bore'|'sky'|'tired'|'i'|'them'|'cats');
VERB:('a'..'z'|'A'..'Z')+;

QUESTMARK:'?';
WS: ' '+ {$channel=HIDDEN;};