// Generated from /home/santiago/IdeaProjects/UNAL/Referenciadoribliografico-DSL/src/main/resources/static/citator.g4 by ANTLR 4.10.1
package Gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link citatorParser}.
 */
public interface citatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link citatorParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(citatorParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(citatorParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#lenguaje}.
	 * @param ctx the parse tree
	 */
	void enterLenguaje(citatorParser.LenguajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#lenguaje}.
	 * @param ctx the parse tree
	 */
	void exitLenguaje(citatorParser.LenguajeContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#citations}.
	 * @param ctx the parse tree
	 */
	void enterCitations(citatorParser.CitationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#citations}.
	 * @param ctx the parse tree
	 */
	void exitCitations(citatorParser.CitationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#citation}.
	 * @param ctx the parse tree
	 */
	void enterCitation(citatorParser.CitationContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#citation}.
	 * @param ctx the parse tree
	 */
	void exitCitation(citatorParser.CitationContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#citationType}.
	 * @param ctx the parse tree
	 */
	void enterCitationType(citatorParser.CitationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#citationType}.
	 * @param ctx the parse tree
	 */
	void exitCitationType(citatorParser.CitationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#authorName}.
	 * @param ctx the parse tree
	 */
	void enterAuthorName(citatorParser.AuthorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#authorName}.
	 * @param ctx the parse tree
	 */
	void exitAuthorName(citatorParser.AuthorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#authorLastName}.
	 * @param ctx the parse tree
	 */
	void enterAuthorLastName(citatorParser.AuthorLastNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#authorLastName}.
	 * @param ctx the parse tree
	 */
	void exitAuthorLastName(citatorParser.AuthorLastNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#citationTitle}.
	 * @param ctx the parse tree
	 */
	void enterCitationTitle(citatorParser.CitationTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#citationTitle}.
	 * @param ctx the parse tree
	 */
	void exitCitationTitle(citatorParser.CitationTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#website}.
	 * @param ctx the parse tree
	 */
	void enterWebsite(citatorParser.WebsiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#website}.
	 * @param ctx the parse tree
	 */
	void exitWebsite(citatorParser.WebsiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#publicationDate}.
	 * @param ctx the parse tree
	 */
	void enterPublicationDate(citatorParser.PublicationDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#publicationDate}.
	 * @param ctx the parse tree
	 */
	void exitPublicationDate(citatorParser.PublicationDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#consultDate}.
	 * @param ctx the parse tree
	 */
	void enterConsultDate(citatorParser.ConsultDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#consultDate}.
	 * @param ctx the parse tree
	 */
	void exitConsultDate(citatorParser.ConsultDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(citatorParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(citatorParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#city}.
	 * @param ctx the parse tree
	 */
	void enterCity(citatorParser.CityContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#city}.
	 * @param ctx the parse tree
	 */
	void exitCity(citatorParser.CityContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#editorial}.
	 * @param ctx the parse tree
	 */
	void enterEditorial(citatorParser.EditorialContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#editorial}.
	 * @param ctx the parse tree
	 */
	void exitEditorial(citatorParser.EditorialContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#resume}.
	 * @param ctx the parse tree
	 */
	void enterResume(citatorParser.ResumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#resume}.
	 * @param ctx the parse tree
	 */
	void exitResume(citatorParser.ResumeContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(citatorParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(citatorParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link citatorParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(citatorParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link citatorParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(citatorParser.MonthContext ctx);
}