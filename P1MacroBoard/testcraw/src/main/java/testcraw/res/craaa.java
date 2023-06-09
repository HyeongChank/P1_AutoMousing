package testcraw.res;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;




public class craaa {
	
	public void crawling() {
		List<News> newsList = new ArrayList<>();
        String url = "https://news.daum.net/digital#1";
        System.out.println(url);
        try {
            // HTML 문서 가져오기
            Document doc = Jsoup.connect(url).get();
            // 뉴스 목록 가져오기
            Elements newsElements = doc.select("ul.list_news2 > li");
            System.out.println(newsElements);
            Element a = doc.selectFirst("span.info_cp");
            System.out.println(a);
            Element b = doc.selectFirst("a.link_txt");
            System.out.println(b);
            for (Element newsElement : newsElements) {
                News news = new News();

                // 제목 가져오기
                Element titleElement = newsElement.selectFirst("strong.tit_news > a");
                news.setTitle(titleElement.text());
                news.setUrl(titleElement.absUrl("href"));

                // 내용 가져오기
                Element summaryElement = newsElement.selectFirst("div.cont_news > p");
                news.setSummary(summaryElement.text());

                // 이미지 가져오기
                Element imageElement = newsElement.selectFirst("img.thumb_g");
                if (imageElement != null) {
                    news.setImageUrl(imageElement.absUrl("src"));
                }

                newsList.add(news);
            }

            // 결과 출력
            for (News news : newsList) {
                System.out.println(news.getTitle());
                System.out.println("url 위===================================================");
                System.out.println("url : "+ news.getUrl());
                System.out.println(news.getSummary());
                System.out.println("imageurl 위===================================================");
                System.out.println(news.getImageUrl());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}

class News {
    private String title;
    private String url;
    private String summary;
    private String imageUrl;

    // getter, setter 생략
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "News [title=" + title + ", url=" + url + ", summary=" + summary + ", imageUrl=" + imageUrl + "]";
    }
}