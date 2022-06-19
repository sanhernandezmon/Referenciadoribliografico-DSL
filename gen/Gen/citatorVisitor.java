// Generated from /home/santiago/IdeaProjects/UNAL/Referenciadoribliografico-DSL/src/main/resources/static/citator.g4 by ANTLR 4.10.1
package Gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link citatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface citatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link citatorParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(citatorParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#lenguaje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenguaje(citatorParser.LenguajeContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#citations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCitations(citatorParser.CitationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#citation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCitation(citatorParser.CitationContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#citationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCitationType(citatorParser.CitationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#authorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorName(citatorParser.AuthorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#authorLastName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorLastName(citatorParser.AuthorLastNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#citationTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCitationTitle(citatorParser.CitationTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#website}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebsite(citatorParser.WebsiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#publicationDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicationDate(citatorParser.PublicationDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#consultDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsultDate(citatorParser.ConsultDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle(citatorParser.ArticleContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#city}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCity(citatorParser.CityContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#editorial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditorial(citatorParser.EditorialContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#resume}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResume(citatorParser.ResumeContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(citatorParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link citatorParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(citatorParser.MonthContext ctx);
}