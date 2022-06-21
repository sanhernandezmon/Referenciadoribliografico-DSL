// Generated from /home/santiago/IdeaProjects/UNAL/Referenciadoribliografico-DSL/src/main/resources/static/citator.g4 by ANTLR 4.10.1
package Gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class citatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, SEMICOLOM=7, LENGUAJEKEY=8, 
		LENGUAJEOPTION=9, CITATIONKEY=10, CITATIONTYPEKEY=11, CITATIONTYPE=12, 
		AUTHORLASTNAMEKEY=13, AUTHORNAMEKEY=14, TITLEKEY=15, PUBLICATIONDATEKEY=16, 
		CONSULTDATEKEY=17, RESUMEKEY=18, CITYKEY=19, EDITORIALKEY=20, WEBSITEKEY=21, 
		ARTICLEKEY=22, JAN=23, FEB=24, MAR=25, APR=26, MAY=27, JUN=28, JUL=29, 
		AUG=30, SEP=31, OCT=32, NOV=33, DEC=34, ID=35, STRING=36, YEAR=37, DAY=38, 
		MONTH=39, PAGINAS=40, VOLUMEN=41, DIGIT=42, FIRSTMONTHDIGIT=43, FIRSTDAYDIGIT=44, 
		SEPARATOR=45;
	public static final int
		RULE_reference = 0, RULE_lenguaje = 1, RULE_citations = 2, RULE_citation = 3, 
		RULE_citationType = 4, RULE_authorName = 5, RULE_authorLastName = 6, RULE_citationTitle = 7, 
		RULE_website = 8, RULE_publicationDate = 9, RULE_consultDate = 10, RULE_article = 11, 
		RULE_city = 12, RULE_editorial = 13, RULE_date = 14, RULE_month = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"reference", "lenguaje", "citations", "citation", "citationType", "authorName", 
			"authorLastName", "citationTitle", "website", "publicationDate", "consultDate", 
			"article", "city", "editorial", "date", "month"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "', '", "')'", null, "';'", "'Lenguaje'", 
			null, "'resource'", "'type'", null, "'last_name'", "'name'", "'title'", 
			"'published_on'", "'consuled_on'", "'resume'", "'city'", "'editorial'", 
			"'website_definition'", "'article_definition'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "SEMICOLOM", "LENGUAJEKEY", 
			"LENGUAJEOPTION", "CITATIONKEY", "CITATIONTYPEKEY", "CITATIONTYPE", "AUTHORLASTNAMEKEY", 
			"AUTHORNAMEKEY", "TITLEKEY", "PUBLICATIONDATEKEY", "CONSULTDATEKEY", 
			"RESUMEKEY", "CITYKEY", "EDITORIALKEY", "WEBSITEKEY", "ARTICLEKEY", "JAN", 
			"FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", 
			"DEC", "ID", "STRING", "YEAR", "DAY", "MONTH", "PAGINAS", "VOLUMEN", 
			"DIGIT", "FIRSTMONTHDIGIT", "FIRSTDAYDIGIT", "SEPARATOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "citator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public citatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ReferenceContext extends ParserRuleContext {
		public LenguajeContext lenguaje() {
			return getRuleContext(LenguajeContext.class,0);
		}
		public CitationsContext citations() {
			return getRuleContext(CitationsContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			lenguaje();
			setState(33);
			citations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LenguajeContext extends ParserRuleContext {
		public TerminalNode LENGUAJEKEY() { return getToken(citatorParser.LENGUAJEKEY, 0); }
		public TerminalNode LENGUAJEOPTION() { return getToken(citatorParser.LENGUAJEOPTION, 0); }
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public LenguajeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lenguaje; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitLenguaje(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenguajeContext lenguaje() throws RecognitionException {
		LenguajeContext _localctx = new LenguajeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lenguaje);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(LENGUAJEKEY);
			setState(36);
			match(LENGUAJEOPTION);
			setState(37);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CitationsContext extends ParserRuleContext {
		public CitationContext citation() {
			return getRuleContext(CitationContext.class,0);
		}
		public CitationsContext citations() {
			return getRuleContext(CitationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(citatorParser.EOF, 0); }
		public CitationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_citations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitCitations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CitationsContext citations() throws RecognitionException {
		CitationsContext _localctx = new CitationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_citations);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				citation();
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					citations();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CitationContext extends ParserRuleContext {
		public TerminalNode CITATIONKEY() { return getToken(citatorParser.CITATIONKEY, 0); }
		public CitationTypeContext citationType() {
			return getRuleContext(CitationTypeContext.class,0);
		}
		public AuthorNameContext authorName() {
			return getRuleContext(AuthorNameContext.class,0);
		}
		public AuthorLastNameContext authorLastName() {
			return getRuleContext(AuthorLastNameContext.class,0);
		}
		public CitationTitleContext citationTitle() {
			return getRuleContext(CitationTitleContext.class,0);
		}
		public PublicationDateContext publicationDate() {
			return getRuleContext(PublicationDateContext.class,0);
		}
		public ConsultDateContext consultDate() {
			return getRuleContext(ConsultDateContext.class,0);
		}
		public CityContext city() {
			return getRuleContext(CityContext.class,0);
		}
		public EditorialContext editorial() {
			return getRuleContext(EditorialContext.class,0);
		}
		public WebsiteContext website() {
			return getRuleContext(WebsiteContext.class,0);
		}
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public CitationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_citation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitCitation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CitationContext citation() throws RecognitionException {
		CitationContext _localctx = new CitationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_citation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(CITATIONKEY);
			setState(48);
			match(T__0);
			setState(49);
			citationType();
			setState(50);
			authorName();
			setState(51);
			authorLastName();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLEKEY) {
				{
				setState(52);
				citationTitle();
				}
			}

			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLICATIONDATEKEY) {
				{
				setState(55);
				publicationDate();
				}
			}

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSULTDATEKEY) {
				{
				setState(58);
				consultDate();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CITYKEY) {
				{
				setState(61);
				city();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EDITORIALKEY) {
				{
				setState(64);
				editorial();
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WEBSITEKEY) {
				{
				setState(67);
				website();
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARTICLEKEY) {
				{
				setState(70);
				article();
				}
			}

			setState(73);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CitationTypeContext extends ParserRuleContext {
		public TerminalNode CITATIONTYPEKEY() { return getToken(citatorParser.CITATIONTYPEKEY, 0); }
		public TerminalNode CITATIONTYPE() { return getToken(citatorParser.CITATIONTYPE, 0); }
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public CitationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_citationType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitCitationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CitationTypeContext citationType() throws RecognitionException {
		CitationTypeContext _localctx = new CitationTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_citationType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CITATIONTYPEKEY);
			setState(76);
			match(CITATIONTYPE);
			setState(77);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuthorNameContext extends ParserRuleContext {
		public TerminalNode AUTHORNAMEKEY() { return getToken(citatorParser.AUTHORNAMEKEY, 0); }
		public List<TerminalNode> ID() { return getTokens(citatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(citatorParser.ID, i);
		}
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public AuthorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitAuthorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorNameContext authorName() throws RecognitionException {
		AuthorNameContext _localctx = new AuthorNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_authorName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(AUTHORNAMEKEY);
			setState(80);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(81);
				match(ID);
				}
			}

			setState(84);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuthorLastNameContext extends ParserRuleContext {
		public TerminalNode AUTHORLASTNAMEKEY() { return getToken(citatorParser.AUTHORLASTNAMEKEY, 0); }
		public List<TerminalNode> ID() { return getTokens(citatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(citatorParser.ID, i);
		}
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public AuthorLastNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorLastName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitAuthorLastName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorLastNameContext authorLastName() throws RecognitionException {
		AuthorLastNameContext _localctx = new AuthorLastNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_authorLastName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(AUTHORLASTNAMEKEY);
			setState(87);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(88);
				match(ID);
				}
			}

			setState(91);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CitationTitleContext extends ParserRuleContext {
		public TerminalNode TITLEKEY() { return getToken(citatorParser.TITLEKEY, 0); }
		public TerminalNode STRING() { return getToken(citatorParser.STRING, 0); }
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public CitationTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_citationTitle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitCitationTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CitationTitleContext citationTitle() throws RecognitionException {
		CitationTitleContext _localctx = new CitationTitleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_citationTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(TITLEKEY);
			setState(94);
			match(STRING);
			setState(95);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WebsiteContext extends ParserRuleContext {
		public TerminalNode WEBSITEKEY() { return getToken(citatorParser.WEBSITEKEY, 0); }
		public List<TerminalNode> STRING() { return getTokens(citatorParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(citatorParser.STRING, i);
		}
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public WebsiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_website; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitWebsite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebsiteContext website() throws RecognitionException {
		WebsiteContext _localctx = new WebsiteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_website);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(WEBSITEKEY);
			setState(98);
			match(STRING);
			setState(99);
			match(STRING);
			setState(100);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicationDateContext extends ParserRuleContext {
		public TerminalNode PUBLICATIONDATEKEY() { return getToken(citatorParser.PUBLICATIONDATEKEY, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public PublicationDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicationDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitPublicationDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicationDateContext publicationDate() throws RecognitionException {
		PublicationDateContext _localctx = new PublicationDateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_publicationDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PUBLICATIONDATEKEY);
			setState(103);
			date();
			setState(104);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsultDateContext extends ParserRuleContext {
		public TerminalNode CONSULTDATEKEY() { return getToken(citatorParser.CONSULTDATEKEY, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public ConsultDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consultDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitConsultDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsultDateContext consultDate() throws RecognitionException {
		ConsultDateContext _localctx = new ConsultDateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_consultDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(CONSULTDATEKEY);
			setState(107);
			date();
			setState(108);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArticleContext extends ParserRuleContext {
		public TerminalNode ARTICLEKEY() { return getToken(citatorParser.ARTICLEKEY, 0); }
		public TerminalNode STRING() { return getToken(citatorParser.STRING, 0); }
		public TerminalNode VOLUMEN() { return getToken(citatorParser.VOLUMEN, 0); }
		public TerminalNode PAGINAS() { return getToken(citatorParser.PAGINAS, 0); }
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitArticle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_article);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ARTICLEKEY);
			setState(111);
			match(T__2);
			setState(112);
			match(STRING);
			setState(113);
			match(T__3);
			setState(114);
			match(VOLUMEN);
			setState(115);
			match(T__3);
			setState(116);
			match(PAGINAS);
			setState(117);
			match(T__4);
			setState(118);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CityContext extends ParserRuleContext {
		public TerminalNode CITYKEY() { return getToken(citatorParser.CITYKEY, 0); }
		public TerminalNode ID() { return getToken(citatorParser.ID, 0); }
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public CityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_city; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitCity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CityContext city() throws RecognitionException {
		CityContext _localctx = new CityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_city);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(CITYKEY);
			setState(121);
			match(ID);
			setState(122);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EditorialContext extends ParserRuleContext {
		public TerminalNode EDITORIALKEY() { return getToken(citatorParser.EDITORIALKEY, 0); }
		public TerminalNode STRING() { return getToken(citatorParser.STRING, 0); }
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public EditorialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editorial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitEditorial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EditorialContext editorial() throws RecognitionException {
		EditorialContext _localctx = new EditorialContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_editorial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(EDITORIALKEY);
			setState(125);
			match(STRING);
			setState(126);
			match(SEMICOLOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(citatorParser.DAY, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(citatorParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(citatorParser.SEPARATOR, i);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public TerminalNode YEAR() { return getToken(citatorParser.YEAR, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(DAY);
			setState(129);
			match(SEPARATOR);
			setState(130);
			month();
			setState(131);
			match(SEPARATOR);
			setState(132);
			match(YEAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode JAN() { return getToken(citatorParser.JAN, 0); }
		public TerminalNode FEB() { return getToken(citatorParser.FEB, 0); }
		public TerminalNode MAR() { return getToken(citatorParser.MAR, 0); }
		public TerminalNode APR() { return getToken(citatorParser.APR, 0); }
		public TerminalNode MAY() { return getToken(citatorParser.MAY, 0); }
		public TerminalNode JUN() { return getToken(citatorParser.JUN, 0); }
		public TerminalNode JUL() { return getToken(citatorParser.JUL, 0); }
		public TerminalNode AUG() { return getToken(citatorParser.AUG, 0); }
		public TerminalNode SEP() { return getToken(citatorParser.SEP, 0); }
		public TerminalNode OCT() { return getToken(citatorParser.OCT, 0); }
		public TerminalNode NOV() { return getToken(citatorParser.NOV, 0); }
		public TerminalNode DEC() { return getToken(citatorParser.DEC, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_month);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAN) | (1L << FEB) | (1L << MAR) | (1L << APR) | (1L << MAY) | (1L << JUN) | (1L << JUL) | (1L << AUG) | (1L << SEP) | (1L << OCT) | (1L << NOV) | (1L << DEC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u0089\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002*\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003"+
		"\u0003\u00039\b\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0003\u0003"+
		"\u0003?\b\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0003\u0003\u0003"+
		"E\b\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005S\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0001\u0001\u0000\u0017\"\u0084"+
		"\u0000 \u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004-"+
		"\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\bK\u0001\u0000"+
		"\u0000\u0000\nO\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000e"+
		"]\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012f\u0001"+
		"\u0000\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016n\u0001\u0000\u0000"+
		"\u0000\u0018x\u0001\u0000\u0000\u0000\u001a|\u0001\u0000\u0000\u0000\u001c"+
		"\u0080\u0001\u0000\u0000\u0000\u001e\u0086\u0001\u0000\u0000\u0000 !\u0003"+
		"\u0002\u0001\u0000!\"\u0003\u0004\u0002\u0000\"\u0001\u0001\u0000\u0000"+
		"\u0000#$\u0005\b\u0000\u0000$%\u0005\t\u0000\u0000%&\u0005\u0007\u0000"+
		"\u0000&\u0003\u0001\u0000\u0000\u0000\')\u0003\u0006\u0003\u0000(*\u0003"+
		"\u0004\u0002\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000"+
		"*.\u0001\u0000\u0000\u0000+.\u0005\u0000\u0000\u0001,.\u0001\u0000\u0000"+
		"\u0000-\'\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005\n\u0000\u000001\u0005"+
		"\u0001\u0000\u000012\u0003\b\u0004\u000023\u0003\n\u0005\u000035\u0003"+
		"\f\u0006\u000046\u0003\u000e\u0007\u000054\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000068\u0001\u0000\u0000\u000079\u0003\u0012\t\u000087\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000"+
		":<\u0003\u0014\n\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<>\u0001\u0000\u0000\u0000=?\u0003\u0018\f\u0000>=\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@B\u0003\u001a\r\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000CE\u0003\u0010\b\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EG\u0001\u0000\u0000\u0000FH\u0003\u0016\u000b\u0000GF\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0005"+
		"\u0002\u0000\u0000J\u0007\u0001\u0000\u0000\u0000KL\u0005\u000b\u0000"+
		"\u0000LM\u0005\f\u0000\u0000MN\u0005\u0007\u0000\u0000N\t\u0001\u0000"+
		"\u0000\u0000OP\u0005\u000e\u0000\u0000PR\u0005#\u0000\u0000QS\u0005#\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0007\u0000\u0000U\u000b\u0001\u0000\u0000\u0000"+
		"VW\u0005\r\u0000\u0000WY\u0005#\u0000\u0000XZ\u0005#\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0007\u0000\u0000\\\r\u0001\u0000\u0000\u0000]^\u0005\u000f"+
		"\u0000\u0000^_\u0005$\u0000\u0000_`\u0005\u0007\u0000\u0000`\u000f\u0001"+
		"\u0000\u0000\u0000ab\u0005\u0015\u0000\u0000bc\u0005$\u0000\u0000cd\u0005"+
		"$\u0000\u0000de\u0005\u0007\u0000\u0000e\u0011\u0001\u0000\u0000\u0000"+
		"fg\u0005\u0010\u0000\u0000gh\u0003\u001c\u000e\u0000hi\u0005\u0007\u0000"+
		"\u0000i\u0013\u0001\u0000\u0000\u0000jk\u0005\u0011\u0000\u0000kl\u0003"+
		"\u001c\u000e\u0000lm\u0005\u0007\u0000\u0000m\u0015\u0001\u0000\u0000"+
		"\u0000no\u0005\u0016\u0000\u0000op\u0005\u0003\u0000\u0000pq\u0005$\u0000"+
		"\u0000qr\u0005\u0004\u0000\u0000rs\u0005)\u0000\u0000st\u0005\u0004\u0000"+
		"\u0000tu\u0005(\u0000\u0000uv\u0005\u0005\u0000\u0000vw\u0005\u0007\u0000"+
		"\u0000w\u0017\u0001\u0000\u0000\u0000xy\u0005\u0013\u0000\u0000yz\u0005"+
		"#\u0000\u0000z{\u0005\u0007\u0000\u0000{\u0019\u0001\u0000\u0000\u0000"+
		"|}\u0005\u0014\u0000\u0000}~\u0005$\u0000\u0000~\u007f\u0005\u0007\u0000"+
		"\u0000\u007f\u001b\u0001\u0000\u0000\u0000\u0080\u0081\u0005&\u0000\u0000"+
		"\u0081\u0082\u0005-\u0000\u0000\u0082\u0083\u0003\u001e\u000f\u0000\u0083"+
		"\u0084\u0005-\u0000\u0000\u0084\u0085\u0005%\u0000\u0000\u0085\u001d\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0007\u0000\u0000\u0000\u0087\u001f\u0001"+
		"\u0000\u0000\u0000\u000b)-58;>ADGRY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}