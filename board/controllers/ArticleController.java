package board.controllers;

import board.domains.ArticleDTO;
import board.domains.ReplyDTO;
import board.impls.ArticleServiceImpl;
import board.services.ArticleService;

public class ArticleController {
    private ArticleService articleService;

    public ArticleController() {
        articleService = new ArticleServiceImpl();
    }

    public void postArticle(ArticleDTO article) {
        articleService.writeArticle(article);
    }

    public void putArticle(ArticleDTO article) {
        articleService.modifyArticle(article);
    }

    public void deleteArticle(ArticleDTO article) {
        articleService.removeArticle(article);
    }

    public void postReply(ReplyDTO Reply) {
        articleService.writeReply(Reply);
    }

    public void deleteReply(ReplyDTO Reply) {
        articleService.removeReply(Reply);
    }

    public ArticleDTO getReadArticle(int artId) {
        return articleService.readArticle(artId);
    }

    public ReplyDTO[] getReadReply(int artId) {
        return articleService.readReply(artId);
    }

}
