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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, SEMICOLOM=8, LENGUAJEKEY=9, 
		LENGUAJEOPTION=10, CITATIONKEY=11, CITATIONTYPEKEY=12, CITATIONTYPE=13, 
		AUTHORLASTNAMEKEY=14, AUTHORNAMEKEY=15, TITLEKEY=16, PUBLICATIONDATEKEY=17, 
		CONSULTDATEKEY=18, RESUMEKEY=19, CITYKEY=20, EDITORIALKEY=21, WEBSITEKEY=22, 
		ARTICLEKEY=23, ID=24, RESUMETEXT=25, DIGIT=26, FIRSTMONTHDIGIT=27, FIRSTDAYDIGIT=28, 
		YEAR=29, DAY=30, MONTH=31, JAN=32, FEB=33, MAR=34, APR=35, MAY=36, JUN=37, 
		JUL=38, AUG=39, SEP=40, OCT=41, NOV=42, DEC=43, SEPARATOR=44;
	public static final int
		RULE_reference = 0, RULE_lenguaje = 1, RULE_citations = 2, RULE_citation = 3, 
		RULE_citationType = 4, RULE_authorName = 5, RULE_authorLastName = 6, RULE_citationTitle = 7, 
		RULE_website = 8, RULE_publicationDate = 9, RULE_consultDate = 10, RULE_article = 11, 
		RULE_city = 12, RULE_editorial = 13, RULE_resume = 14, RULE_date = 15, 
		RULE_month = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"reference", "lenguaje", "citations", "citation", "citationType", "authorName", 
			"authorLastName", "citationTitle", "website", "publicationDate", "consultDate", 
			"article", "city", "editorial", "resume", "date", "month"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "', '", "')'", "'\"'", null, "';'", "'Lenguaje'", 
			null, "'resource'", "'type'", null, "'last_name'", "'name'", "'title'", 
			"'published_on'", "'consuled_on'", "'resume'", "'city'", "'editorial'", 
			"'website_definition'", "'article_definition'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "WS", "SEMICOLOM", "LENGUAJEKEY", 
			"LENGUAJEOPTION", "CITATIONKEY", "CITATIONTYPEKEY", "CITATIONTYPE", "AUTHORLASTNAMEKEY", 
			"AUTHORNAMEKEY", "TITLEKEY", "PUBLICATIONDATEKEY", "CONSULTDATEKEY", 
			"RESUMEKEY", "CITYKEY", "EDITORIALKEY", "WEBSITEKEY", "ARTICLEKEY", "ID", 
			"RESUMETEXT", "DIGIT", "FIRSTMONTHDIGIT", "FIRSTDAYDIGIT", "YEAR", "DAY", 
			"MONTH", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", 
			"OCT", "NOV", "DEC", "SEPARATOR"
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
			setState(34);
			lenguaje();
			setState(35);
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
			setState(37);
			match(LENGUAJEKEY);
			setState(38);
			match(LENGUAJEOPTION);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				citation();
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(41);
					citations();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
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
		public ResumeContext resume() {
			return getRuleContext(ResumeContext.class,0);
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
			setState(48);
			match(CITATIONKEY);
			setState(49);
			match(T__0);
			setState(50);
			citationType();
			setState(51);
			authorName();
			setState(52);
			authorLastName();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLEKEY) {
				{
				setState(53);
				citationTitle();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLICATIONDATEKEY) {
				{
				setState(56);
				publicationDate();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSULTDATEKEY) {
				{
				setState(59);
				consultDate();
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESUMEKEY) {
				{
				setState(62);
				resume();
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CITYKEY) {
				{
				setState(65);
				city();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EDITORIALKEY) {
				{
				setState(68);
				editorial();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WEBSITEKEY) {
				{
				setState(71);
				website();
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARTICLEKEY) {
				{
				setState(74);
				article();
				}
			}

			setState(77);
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
			setState(79);
			match(CITATIONTYPEKEY);
			setState(80);
			match(CITATIONTYPE);
			setState(81);
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
		public TerminalNode ID() { return getToken(citatorParser.ID, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(AUTHORNAMEKEY);
			setState(84);
			match(ID);
			setState(85);
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
		public TerminalNode ID() { return getToken(citatorParser.ID, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(AUTHORLASTNAMEKEY);
			setState(88);
			match(ID);
			setState(89);
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
		public TerminalNode ID() { return getToken(citatorParser.ID, 0); }
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
			setState(91);
			match(TITLEKEY);
			setState(92);
			match(ID);
			setState(93);
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
		public List<TerminalNode> ID() { return getTokens(citatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(citatorParser.ID, i);
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
			setState(95);
			match(WEBSITEKEY);
			setState(96);
			match(ID);
			setState(97);
			match(ID);
			setState(98);
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
			setState(100);
			match(PUBLICATIONDATEKEY);
			setState(101);
			date();
			setState(102);
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
			setState(104);
			match(CONSULTDATEKEY);
			setState(105);
			date();
			setState(106);
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
		public List<TerminalNode> ID() { return getTokens(citatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(citatorParser.ID, i);
		}
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
			setState(108);
			match(ARTICLEKEY);
			setState(109);
			match(T__2);
			setState(110);
			match(ID);
			setState(111);
			match(T__3);
			setState(112);
			match(ID);
			setState(113);
			match(T__3);
			setState(114);
			match(ID);
			setState(115);
			match(T__4);
			setState(116);
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
			setState(118);
			match(CITYKEY);
			setState(119);
			match(ID);
			setState(120);
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
		public TerminalNode ID() { return getToken(citatorParser.ID, 0); }
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
			setState(122);
			match(EDITORIALKEY);
			setState(123);
			match(ID);
			setState(124);
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

	public static class ResumeContext extends ParserRuleContext {
		public TerminalNode RESUMEKEY() { return getToken(citatorParser.RESUMEKEY, 0); }
		public TerminalNode RESUMETEXT() { return getToken(citatorParser.RESUMETEXT, 0); }
		public TerminalNode SEMICOLOM() { return getToken(citatorParser.SEMICOLOM, 0); }
		public ResumeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resume; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof citatorVisitor ) return ((citatorVisitor<? extends T>)visitor).visitResume(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResumeContext resume() throws RecognitionException {
		ResumeContext _localctx = new ResumeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_resume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(RESUMEKEY);
			setState(127);
			match(T__5);
			setState(128);
			match(RESUMETEXT);
			setState(129);
			match(T__5);
			setState(130);
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
		public TerminalNode MONTH() { return getToken(citatorParser.MONTH, 0); }
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
		enterRule(_localctx, 30, RULE_date);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(DAY);
				setState(133);
				match(SEPARATOR);
				setState(134);
				month();
				setState(135);
				match(SEPARATOR);
				setState(136);
				match(YEAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(DAY);
				setState(139);
				match(SEPARATOR);
				setState(140);
				match(MONTH);
				setState(141);
				match(SEPARATOR);
				setState(142);
				match(YEAR);
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
		enterRule(_localctx, 32, RULE_month);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		"\u0004\u0001,\u0094\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002+\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00037\b\u0003"+
		"\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001"+
		"\u0003\u0003\u0003@\b\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0003"+
		"\u0003\u0003F\b\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0003\u0003"+
		"\u0003L\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0090\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000"+
		"\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \u0000\u0001\u0001\u0000 +\u008e\u0000\"\u0001"+
		"\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000"+
		"\u0000\u00060\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\nS\u0001"+
		"\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000"+
		"\u0000\u0010_\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014"+
		"h\u0001\u0000\u0000\u0000\u0016l\u0001\u0000\u0000\u0000\u0018v\u0001"+
		"\u0000\u0000\u0000\u001az\u0001\u0000\u0000\u0000\u001c~\u0001\u0000\u0000"+
		"\u0000\u001e\u008f\u0001\u0000\u0000\u0000 \u0091\u0001\u0000\u0000\u0000"+
		"\"#\u0003\u0002\u0001\u0000#$\u0003\u0004\u0002\u0000$\u0001\u0001\u0000"+
		"\u0000\u0000%&\u0005\t\u0000\u0000&\'\u0005\n\u0000\u0000\'\u0003\u0001"+
		"\u0000\u0000\u0000(*\u0003\u0006\u0003\u0000)+\u0003\u0004\u0002\u0000"+
		"*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+/\u0001\u0000\u0000"+
		"\u0000,/\u0005\u0000\u0000\u0001-/\u0001\u0000\u0000\u0000.(\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0005"+
		"\u0001\u0000\u0000\u000001\u0005\u000b\u0000\u000012\u0005\u0001\u0000"+
		"\u000023\u0003\b\u0004\u000034\u0003\n\u0005\u000046\u0003\f\u0006\u0000"+
		"57\u0003\u000e\u0007\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000079\u0001\u0000\u0000\u00008:\u0003\u0012\t\u000098\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;=\u0003\u0014"+
		"\n\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000"+
		"\u0000\u0000>@\u0003\u001c\u000e\u0000?>\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000AC\u0003\u0018\f\u0000BA\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000"+
		"DF\u0003\u001a\r\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FH\u0001\u0000\u0000\u0000GI\u0003\u0010\b\u0000HG\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JL\u0003\u0016\u000b"+
		"\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0005\u0002\u0000\u0000N\u0007\u0001\u0000\u0000\u0000"+
		"OP\u0005\f\u0000\u0000PQ\u0005\r\u0000\u0000QR\u0005\b\u0000\u0000R\t"+
		"\u0001\u0000\u0000\u0000ST\u0005\u000f\u0000\u0000TU\u0005\u0018\u0000"+
		"\u0000UV\u0005\b\u0000\u0000V\u000b\u0001\u0000\u0000\u0000WX\u0005\u000e"+
		"\u0000\u0000XY\u0005\u0018\u0000\u0000YZ\u0005\b\u0000\u0000Z\r\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u0010\u0000\u0000\\]\u0005\u0018\u0000\u0000"+
		"]^\u0005\b\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005\u0016\u0000"+
		"\u0000`a\u0005\u0018\u0000\u0000ab\u0005\u0018\u0000\u0000bc\u0005\b\u0000"+
		"\u0000c\u0011\u0001\u0000\u0000\u0000de\u0005\u0011\u0000\u0000ef\u0003"+
		"\u001e\u000f\u0000fg\u0005\b\u0000\u0000g\u0013\u0001\u0000\u0000\u0000"+
		"hi\u0005\u0012\u0000\u0000ij\u0003\u001e\u000f\u0000jk\u0005\b\u0000\u0000"+
		"k\u0015\u0001\u0000\u0000\u0000lm\u0005\u0017\u0000\u0000mn\u0005\u0003"+
		"\u0000\u0000no\u0005\u0018\u0000\u0000op\u0005\u0004\u0000\u0000pq\u0005"+
		"\u0018\u0000\u0000qr\u0005\u0004\u0000\u0000rs\u0005\u0018\u0000\u0000"+
		"st\u0005\u0005\u0000\u0000tu\u0005\b\u0000\u0000u\u0017\u0001\u0000\u0000"+
		"\u0000vw\u0005\u0014\u0000\u0000wx\u0005\u0018\u0000\u0000xy\u0005\b\u0000"+
		"\u0000y\u0019\u0001\u0000\u0000\u0000z{\u0005\u0015\u0000\u0000{|\u0005"+
		"\u0018\u0000\u0000|}\u0005\b\u0000\u0000}\u001b\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u0013\u0000\u0000\u007f\u0080\u0005\u0006\u0000\u0000\u0080"+
		"\u0081\u0005\u0019\u0000\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082"+
		"\u0083\u0005\b\u0000\u0000\u0083\u001d\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\u001e\u0000\u0000\u0085\u0086\u0005,\u0000\u0000\u0086\u0087\u0003"+
		" \u0010\u0000\u0087\u0088\u0005,\u0000\u0000\u0088\u0089\u0005\u001d\u0000"+
		"\u0000\u0089\u0090\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u001e\u0000"+
		"\u0000\u008b\u008c\u0005,\u0000\u0000\u008c\u008d\u0005\u001f\u0000\u0000"+
		"\u008d\u008e\u0005,\u0000\u0000\u008e\u0090\u0005\u001d\u0000\u0000\u008f"+
		"\u0084\u0001\u0000\u0000\u0000\u008f\u008a\u0001\u0000\u0000\u0000\u0090"+
		"\u001f\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0000\u0000\u0000\u0092"+
		"!\u0001\u0000\u0000\u0000\u000b*.69<?BEHK\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}