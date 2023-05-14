package testcrawling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class tc {
	public static void main(String[] args) {
		List<News> newsList = new ArrayList<>();
		String url = "https://news.daum.net/digital#1";
		
		try {
			// HTML 문서 가져오기
			Document doc = Jsoup.connect(url).get();
			
			// 뉴스 목록 가져오기
			Elements newsElements = ((Elements) doc).select("ul.list_news2 > li");
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
				System.out.println(news.getUrl());
				System.out.println(news.getSummary());
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
