package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.fail;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class YouTubeWithoutIDLReasonerTest {

	private final String apiKey1 = "YOUR_API_KEY_1";
	private final String apiKey2 = "YOUR_API_KEY_2";

	@BeforeClass
 	public static void setUp() {
		RestAssured.baseURI = "https://www.googleapis.com/youtube/v3";
	}

	@Test
	public void youtubeSearchListTest_vf98gmqvyo1e() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("videoEmbeddable", "any")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("location", "-33.924278,18.424572")
				.param("videoDefinition", "standard")
				.param("eventType", "completed")
				.param("type", "playlist")
				.param("videoSyndicated", "true")
				.param("safeSearch", "strict")
				.param("videoLicense", "any")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_vbk77ulkc183() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("q", "soccer")
				.param("videoCaption", "any")
				.param("regionCode", "us")
				.param("topicId", "/m/04rlf")
				.param("videoCategoryId", "5")
				.param("part", "snippet")
				.param("eventType", "live")
				.param("pageToken", "CBkQAA")
				.param("videoSyndicated", "true")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1hrj6v7gokm5s() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("q", "soccer")
				.param("videoCaption", "none")
				.param("regionCode", "de")
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("videoLicense", "youtube")
				.param("relevanceLanguage", "pt")
				.param("order", "videoCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_t49jvupxyuk3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("type", "channel")
				.param("videoSyndicated", "any")
				.param("topicId", "/m/02vxn")
				.param("videoEmbeddable", "any")
				.param("maxResults", "15")
				.param("videoCategoryId", "4")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_ursfh35obw3a() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("part", "snippet")
				.param("channelType", "show")
				.param("videoSyndicated", "any")
				.param("safeSearch", "strict")
				.param("videoLicense", "youtube")
				.param("locationRadius", "5km")
				.param("q", "soccer")
				.param("regionCode", "pt")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "1")
				.param("videoDimension", "3d")
				.param("location", "-37.812746,144.961832")
				.param("pageToken", "CA8QAA")
				.param("relevanceLanguage", "de")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_tofotladmtyr() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("q", "late night show")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "medium")
				.param("videoCategoryId", "3")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("location", "35.681999,139.769254")
				.param("videoDefinition", "high")
				.param("pageToken", "CA8QAA")
				.param("videoSyndicated", "true")
				.param("relevanceLanguage", "en")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1ib99chrwdnqe() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "high")
				.param("type", "video,channel")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "500km")
				.param("q", "music")
				.param("maxResults", "15")
				.param("location", "-33.924278,18.424572")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
				.param("relevanceLanguage", "pt")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_sok4mxw84do3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "500km")
				.param("topicId", "/m/02vxn")
				.param("maxResults", "5")
				.param("videoCategoryId", "4")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("pageToken", "CAoQAA")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
				.param("videoLicense", "youtube")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_rhufdchsnpyp() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "live")
				.param("safeSearch", "moderate")
				.param("videoLicense", "any")
				.param("locationRadius", "500km")
				.param("q", "soccer")
				.param("regionCode", "us")
				.param("videoEmbeddable", "any")
				.param("videoDimension", "2d")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("relevanceLanguage", "pt")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_rl2uzxjhhkqe() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("relatedToVideoId", "7m-NPuXPBqM")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "any")
				.param("eventType", "completed")
				.param("type", "video,channel,playlist")
				.param("locationRadius", "500km")
				.param("q", "GoT reactions")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "true")
				.param("maxResults", "5")
				.param("videoCategoryId", "5")
				.param("location", "-33.924278,18.424572")
				.param("pageToken", "CAoQAA")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_rhlm1xkoiijm() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "5km")
				.param("regionCode", "us")
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("videoDuration", "long")
				.param("maxResults", "0")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("type", "video,playlist")
				.param("videoLicense", "youtube")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1jia1e9m52oo6() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "500km")
				.param("q", "GoT reactions")
				.param("videoCaption", "any")
				.param("regionCode", "pt")
				.param("videoDuration", "short")
				.param("videoDimension", "2d")
				.param("part", "snippet")
				.param("location", "35.681999,139.769254")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qefgo7yumwqb() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("regionCode", "es")
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("topicId", "/m/04rlf")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "2")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "upcoming")
				.param("pageToken", "CBkQAA")
				.param("safeSearch", "strict")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1hrgywf2dunhg() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "show")
				.param("videoDefinition", "any")
				.param("eventType", "upcoming")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
				.param("videoLicense", "any")
				.param("q", "cats")
				.param("topicId", "/m/025zzc")
				.param("videoEmbeddable", "any")
				.param("maxResults", "30")
				.param("videoDimension", "3d")
				.param("pageToken", "CAUQAA")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
				.param("order", "videoCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_tocw9jcdtdtj() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("relatedToVideoId", "yDgLFOxnQ8Y")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("videoDefinition", "high")
				.param("eventType", "live")
				.param("videoLicense", "any")
				.param("q", "music")
				.param("regionCode", "de")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "1")
				.param("videoDimension", "2d")
				.param("location", "-33.924278,18.424572")
				.param("pageToken", "CAUQAA")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qeewvegh15wy() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("part", "snippet")
				.param("channelType", "show")
				.param("eventType", "live")
				.param("type", "video")
				.param("safeSearch", "none")
				.param("locationRadius", "5km")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "any")
				.param("maxResults", "30")
				.param("videoCategoryId", "4")
				.param("videoDimension", "3d")
				.param("location", "37.42307,-122.08427")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_u7ojzsd19hys() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("relatedToVideoId", "7m-NPuXPBqM")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "any")
				.param("type", "channel")
				.param("videoSyndicated", "true")
				.param("videoLicense", "creativeCommon")
				.param("regionCode", "pt")
				.param("topicId", "/m/098wr")
				.param("videoCategoryId", "2")
				.param("pageToken", "CAUQAA")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qe9v6ko0jrci() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "show")
				.param("type", "video,playlist")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "any")
				.param("maxResults", "15")
				.param("videoCategoryId", "2")
				.param("videoDimension", "2d")
				.param("location", "-37.812746,144.961832")
				.param("pageToken", "CAUQAA")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1iv11v3gznvhz() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "1500m")
				.param("videoCaption", "none")
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("videoDuration", "medium")
				.param("videoDimension", "any")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("eventType", "completed")
				.param("videoSyndicated", "true")
				.param("videoLicense", "creativeCommon")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1h7zae515j4h1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("relatedToVideoId", "yDgLFOxnQ8Y")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("videoDefinition", "standard")
				.param("videoSyndicated", "any")
				.param("safeSearch", "strict")
				.param("locationRadius", "1500m")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_ureko1adkfuh() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("eventType", "completed")
				.param("type", "video,channel,playlist")
				.param("q", "cats")
				.param("regionCode", "es")
				.param("topicId", "/m/025zzc")
				.param("videoDuration", "short")
				.param("maxResults", "50")
				.param("videoDimension", "3d")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CBQQAA")
				.param("relevanceLanguage", "pt")
				.param("order", "date")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_sl3we0ddfzhe() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("q", "soccer")
				.param("regionCode", "us")
				.param("topicId", "/m/025zzc")
				.param("videoDuration", "short")
				.param("videoCategoryId", "4")
				.param("videoDimension", "any")
				.param("pageToken", "CAUQAA")
				.param("relevanceLanguage", "pt")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1iyq3fu4de3hy() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("eventType", "completed")
				.param("type", "video,channel")
				.param("safeSearch", "strict")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "1m")
				.param("q", "GoT reactions")
				.param("regionCode", "it")
				.param("topicId", "/m/025zzc")
				.param("maxResults", "0")
				.param("videoCategoryId", "5")
				.param("location", "37.392191,-5.995193")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
				.param("relevanceLanguage", "pt")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_rh4yowyth55x() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("type", "channel,playlist")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("videoLicense", "youtube")
				.param("locationRadius", "1000km")
				.param("q", "GoT reactions")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "5")
				.param("videoDimension", "2d")
				.param("location", "-37.812746,144.961832")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1h7z8uai1xulx() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "show")
				.param("safeSearch", "none")
				.param("locationRadius", "500km")
				.param("q", "cats")
				.param("regionCode", "it")
				.param("videoDuration", "any")
				.param("videoCategoryId", "1")
				.param("videoDimension", "3d")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CAoQAA")
				.param("relevanceLanguage", "pt")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_vbn05pr28gtz() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "any")
				.param("eventType", "live")
				.param("safeSearch", "moderate")
				.param("videoLicense", "any")
				.param("q", "GoT reactions")
				.param("videoDuration", "short")
				.param("videoCategoryId", "4")
				.param("videoDimension", "any")
				.param("pageToken", "CBQQAA")
				.param("relevanceLanguage", "pt")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_s0uiulkqbtix() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("type", "video,playlist")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "youtube")
				.param("locationRadius", "1500m")
				.param("q", "soccer")
				.param("maxResults", "30")
				.param("videoDimension", "any")
				.param("pageToken", "CA8QAA")
				.param("relevanceLanguage", "es")
				.param("order", "rating")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_t4nvu3wjzhic() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "show")
				.param("eventType", "upcoming")
				.param("type", "video,playlist")
				.param("safeSearch", "moderate")
				.param("locationRadius", "5km")
				.param("topicId", "/m/025zzc")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("videoCategoryId", "2")
				.param("videoDimension", "3d")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CBkQAA")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_ubuonezxaed1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("relatedToVideoId", "7m-NPuXPBqM")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("eventType", "live")
				.param("safeSearch", "moderate")
				.param("locationRadius", "1000km")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "4")
				.param("videoDimension", "2d")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_rhoelrciefqx() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "500km")
				.param("relatedToVideoId", "yDgLFOxnQ8Y")
				.param("topicId", "/m/025zzc")
				.param("videoCategoryId", "1")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("location", "-37.812746,144.961832")
				.param("type", "video,channel")
				.param("videoSyndicated", "any")
				.param("videoLicense", "creativeCommon")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1jecmy1avqkog() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "upcoming")
				.param("type", "channel,playlist")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "1000km")
				.param("q", "music")
				.param("videoEmbeddable", "any")
				.param("videoDimension", "any")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CAUQAA")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1k201ae0qufqx() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "500km")
				.param("videoEmbeddable", "any")
				.param("videoDimension", "any")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("location", "-33.924278,18.424572")
				.param("videoDefinition", "high")
				.param("eventType", "live")
				.param("pageToken", "CAUQAA")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
				.param("relevanceLanguage", "it")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_tolpio4dvtiu() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("videoDefinition", "high")
				.param("eventType", "live")
				.param("type", "channel,playlist")
				.param("videoSyndicated", "true")
				.param("regionCode", "de")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "any")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1jydbftmhjh2o() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("videoDefinition", "high")
				.param("eventType", "live")
				.param("safeSearch", "strict")
				.param("locationRadius", "5km")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "3")
				.param("videoDimension", "3d")
				.param("location", "35.681999,139.769254")
				.param("relevanceLanguage", "it")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1iun49sstcyg3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("relatedToVideoId", "yDgLFOxnQ8Y")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "any")
				.param("eventType", "completed")
				.param("videoSyndicated", "true")
				.param("videoLicense", "youtube")
				.param("topicId", "/m/025zzc")
				.param("videoEmbeddable", "true")
				.param("maxResults", "15")
				.param("videoCategoryId", "3")
				.param("videoDimension", "2d")
				.param("location", "-33.924278,18.424572")
				.param("pageToken", "CBQQAA")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qxw485e9rb5e() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("videoDefinition", "high")
				.param("eventType", "upcoming")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "5km")
				.param("q", "GoT reactions")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "any")
				.param("maxResults", "30")
				.param("location", "-37.812746,144.961832")
				.param("order", "title")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1hr843c39bfp4() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("part", "snippet")
				.param("eventType", "completed")
				.param("type", "video,channel,playlist")
				.param("videoSyndicated", "true")
				.param("q", "late night show")
				.param("regionCode", "pt")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "true")
				.param("videoDimension", "3d")
				.param("pageToken", "CBkQAA")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
				.param("relevanceLanguage", "pt")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_rhgl7n6jlmwl() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "500km")
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("topicId", "/m/025zzc")
				.param("videoDuration", "short")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("type", "video,channel")
				.param("videoSyndicated", "true")
				.param("relevanceLanguage", "en")
				.param("order", "rating")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1k1rpi32uznlf() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("videoDefinition", "standard")
				.param("eventType", "completed")
				.param("safeSearch", "none")
				.param("videoLicense", "creativeCommon")
				.param("q", "late night show")
				.param("regionCode", "es")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "5")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_uv6dxybjnnsp() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("relatedToVideoId", "7m-NPuXPBqM")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "channel")
				.param("videoSyndicated", "any")
				.param("safeSearch", "moderate")
				.param("videoLicense", "youtube")
				.param("q", "music")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "any")
				.param("pageToken", "CBkQAA")
				.param("relevanceLanguage", "pt")
				.param("order", "videoCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_s15k07792jhs() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "1000km")
				.param("q", "cats")
				.param("regionCode", "pt")
				.param("relatedToVideoId", "yDgLFOxnQ8Y")
				.param("topicId", "/m/04rlf")
				.param("videoCategoryId", "5")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("videoDefinition", "high")
				.param("eventType", "live")
				.param("videoSyndicated", "any")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_vbk6wa8nmfz5() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("eventType", "live")
				.param("type", "channel,playlist")
				.param("videoLicense", "creativeCommon")
				.param("regionCode", "es")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "any")
				.param("videoCategoryId", "5")
				.param("videoDimension", "3d")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CA8QAA")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
				.param("order", "title")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1h7o67f19bskj() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "any")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
				.param("locationRadius", "500km")
				.param("regionCode", "us")
				.param("topicId", "/m/06ntj")
				.param("videoCategoryId", "4")
				.param("videoDimension", "3d")
				.param("location", "35.681999,139.769254")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_t4yimtqsxftx() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("videoDuration", "medium")
				.param("maxResults", "0")
				.param("videoCategoryId", "2")
				.param("videoDimension", "2d")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("pageToken", "CAUQAA")
				.param("type", "video,channel,playlist")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1h7tqx7z8bbz6() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("regionCode", "es")
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("videoDimension", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("type", "video,playlist")
				.param("safeSearch", "strict")
				.param("videoLicense", "youtube")
				.param("relevanceLanguage", "it")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_s4mamxo2uwkj() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("regionCode", "us")
				.param("topicId", "/m/025zzc")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "4")
				.param("part", "snippet")
				.param("eventType", "live")
				.param("pageToken", "CAUQAA")
				.param("safeSearch", "none")
				.param("relevanceLanguage", "de")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_s506onzdzcj8() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "channel")
				.param("videoLicense", "creativeCommon")
				.param("regionCode", "it")
				.param("topicId", "/m/025zzc")
				.param("videoDuration", "medium")
				.param("maxResults", "30")
				.param("videoDimension", "2d")
				.param("location", "35.681999,139.769254")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1ibh2fbs1o5rr() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "any")
				.param("type", "video,playlist")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "500km")
				.param("regionCode", "pt")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("maxResults", "30")
				.param("videoCategoryId", "4")
				.param("videoDimension", "any")
				.param("location", "35.681999,139.769254")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_vf3na891m78y() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("relatedToVideoId", "yDgLFOxnQ8Y")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "completed")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("q", "music")
				.param("regionCode", "de")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "4")
				.param("videoDimension", "3d")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CBkQAA")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1jy27kjnu3nsn() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "standard")
				.param("eventType", "live")
				.param("type", "channel")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "creativeCommon")
				.param("q", "GoT reactions")
				.param("regionCode", "de")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("pageToken", "CBkQAA")
				.param("relevanceLanguage", "de")
				.param("order", "date")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1jelhfnvo4jtt() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "any")
				.param("videoDefinition", "standard")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("locationRadius", "1000km")
				.param("q", "soccer")
				.param("regionCode", "us")
				.param("topicId", "/m/04rlf")
				.param("videoEmbeddable", "true")
				.param("maxResults", "30")
				.param("videoCategoryId", "1")
				.param("relevanceLanguage", "en")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_s15lkdy6uoms() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "any")
				.param("locationRadius", "1m")
				.param("regionCode", "us")
				.param("videoEmbeddable", "true")
				.param("videoDimension", "2d")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CAoQAA")
				.param("relevanceLanguage", "es")
				.param("order", "date")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_vbngldj2ji9j() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("relatedToVideoId", "7m-NPuXPBqM")
				.param("part", "snippet")
				.param("type", "video,channel")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
				.param("q", "cats")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("videoCategoryId", "2")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CAUQAA")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qe1jutm8tffq() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("eventType", "live")
				.param("type", "channel")
				.param("videoLicense", "youtube")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "long")
				.param("maxResults", "5")
				.param("videoDimension", "any")
				.param("location", "37.392191,-5.995193")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
				.param("order", "rating")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_t4f3qx7xu1k5() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "soccer")
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("topicId", "/m/04rlf")
				.param("maxResults", "30")
				.param("part", "snippet")
				.param("videoDefinition", "high")
				.param("videoSyndicated", "true")
				.param("order", "rating")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1iempkjjzku9g() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("videoDefinition", "any")
				.param("type", "video,playlist")
				.param("regionCode", "it")
				.param("topicId", "/m/025zzc")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "true")
				.param("maxResults", "5")
				.param("location", "-37.812746,144.961832")
				.param("pageToken", "CA8QAA")
				.param("relevanceLanguage", "pt")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1iyl0n69td0l5() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("regionCode", "es")
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("videoDuration", "any")
				.param("maxResults", "50")
				.param("videoCategoryId", "4")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("pageToken", "CA8QAA")
				.param("safeSearch", "strict")
				.param("videoLicense", "youtube")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_t4w8ehe8p1ly() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("eventType", "upcoming")
				.param("videoSyndicated", "any")
				.param("safeSearch", "moderate")
				.param("locationRadius", "1500m")
				.param("regionCode", "pt")
				.param("topicId", "/m/06ntj")
				.param("maxResults", "30")
				.param("videoCategoryId", "1")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CA8QAA")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_rh5jchp6irsh() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("part", "snippet")
				.param("eventType", "upcoming")
				.param("videoSyndicated", "true")
				.param("safeSearch", "strict")
				.param("videoLicense", "any")
				.param("q", "music")
				.param("videoEmbeddable", "any")
				.param("maxResults", "15")
				.param("videoDimension", "2d")
				.param("location", "-33.924278,18.424572")
				.param("pageToken", "CAUQAA")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_trz6dcev59vc() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "1000km")
				.param("videoCaption", "closedCaption")
				.param("videoEmbeddable", "any")
				.param("videoDimension", "2d")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "any")
				.param("videoDefinition", "high")
				.param("eventType", "live")
				.param("videoSyndicated", "any")
				.param("videoLicense", "any")
				.param("relevanceLanguage", "it")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_urrw1wxe5nqc() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "any")
				.param("type", "channel,playlist")
				.param("safeSearch", "strict")
				.param("locationRadius", "1000km")
				.param("q", "late night show")
				.param("regionCode", "pt")
				.param("topicId", "/m/04rlf")
				.param("videoDuration", "long")
				.param("maxResults", "5")
				.param("videoDimension", "3d")
				.param("pageToken", "CBkQAA")
				.param("order", "date")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_vb3jsffbcawl() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "5km")
				.param("q", "cats")
				.param("videoDuration", "medium")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("eventType", "upcoming")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "youtube")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qeexnafvox86() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "any")
				.param("videoDefinition", "standard")
				.param("type", "channel,playlist")
				.param("videoSyndicated", "any")
				.param("safeSearch", "moderate")
				.param("locationRadius", "1000km")
				.param("videoDuration", "any")
				.param("videoCategoryId", "3")
				.param("videoDimension", "3d")
				.param("relevanceLanguage", "de")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_r1fmk6llo4me() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("regionCode", "es")
				.param("maxResults", "30")
				.param("videoDimension", "2d")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CBQQAA")
				.param("safeSearch", "none")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("relevanceLanguage", "pt")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qy1npcc738s4() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "1500m")
				.param("q", "cats")
				.param("videoCaption", "closedCaption")
				.param("maxResults", "30")
				.param("videoCategoryId", "4")
				.param("part", "snippet")
				.param("pageToken", "CAUQAA")
				.param("type", "video,channel,playlist")
				.param("videoSyndicated", "any")
				.param("videoLicense", "youtube")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_t4sxu7qe9u0m() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "none")
				.param("relatedToVideoId", "yDgLFOxnQ8Y")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "completed")
				.param("videoSyndicated", "any")
				.param("videoLicense", "youtube")
				.param("q", "GoT reactions")
				.param("regionCode", "us")
				.param("videoDuration", "short")
				.param("maxResults", "15")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CA8QAA")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_rhugje838303() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "late night show")
				.param("videoCaption", "closedCaption")
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("videoEmbeddable", "true")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("videoDefinition", "standard")
				.param("pageToken", "CAoQAA")
				.param("safeSearch", "strict")
				.param("videoLicense", "youtube")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
				.param("order", "date")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_rlam25nrx8it() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "any")
				.param("videoDefinition", "any")
				.param("type", "channel")
				.param("safeSearch", "none")
				.param("locationRadius", "1500m")
				.param("regionCode", "pt")
				.param("topicId", "/m/025zzc")
				.param("videoCategoryId", "2")
				.param("videoDimension", "2d")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("relevanceLanguage", "pt")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1iyexm0qg1dfc() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "show")
				.param("safeSearch", "moderate")
				.param("videoLicense", "any")
				.param("locationRadius", "500km")
				.param("regionCode", "it")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "any")
				.param("maxResults", "5")
				.param("videoCategoryId", "1")
				.param("videoDimension", "any")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
				.param("order", "videoCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_u87wjijqxph5() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("regionCode", "us")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "short")
				.param("videoDimension", "3d")
				.param("part", "snippet")
				.param("eventType", "completed")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("relevanceLanguage", "es")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_trzninlc4lrn() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("videoDefinition", "standard")
				.param("type", "channel,playlist")
				.param("videoSyndicated", "any")
				.param("safeSearch", "moderate")
				.param("locationRadius", "1500m")
				.param("q", "late night show")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "true")
				.param("maxResults", "50")
				.param("location", "-37.812746,144.961832")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qhntpyzscmsl() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "soccer")
				.param("videoCaption", "closedCaption")
				.param("topicId", "/m/025zzc")
				.param("videoEmbeddable", "any")
				.param("videoDimension", "any")
				.param("part", "snippet")
				.param("location", "-37.812746,144.961832")
				.param("eventType", "completed")
				.param("type", "video")
				.param("relevanceLanguage", "de")
				.param("order", "videoCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qhq3huo5nigo() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("topicId", "/m/098wr")
				.param("videoCategoryId", "4")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("location", "-37.812746,144.961832")
				.param("eventType", "live")
				.param("type", "channel")
				.param("videoSyndicated", "true")
				.param("order", "title")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_u7ul5glresf6() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "standard")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "1000km")
				.param("q", "soccer")
				.param("regionCode", "de")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("videoDimension", "3d")
				.param("pageToken", "CAUQAA")
				.param("relevanceLanguage", "pt")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1hbd6zrmmqgc2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "soccer")
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("topicId", "/m/098wr")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "2")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1k25ljx09c8xi() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "show")
				.param("videoDefinition", "standard")
				.param("eventType", "live")
				.param("type", "channel,playlist")
				.param("q", "GoT reactions")
				.param("regionCode", "us")
				.param("topicId", "/m/02vxn")
				.param("maxResults", "15")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
				.param("order", "date")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_ts2foudc9c8i() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("relatedToVideoId", "7m-NPuXPBqM")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "any")
				.param("type", "video,channel,playlist")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "500km")
				.param("regionCode", "us")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "any")
				.param("maxResults", "50")
				.param("videoCategoryId", "3")
				.param("pageToken", "CAoQAA")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
				.param("relevanceLanguage", "en")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_sl0o8vy1mjhv() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "any")
				.param("videoDefinition", "any")
				.param("type", "channel")
				.param("regionCode", "es")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "any")
				.param("maxResults", "0")
				.param("videoCategoryId", "2")
				.param("videoDimension", "2d")
				.param("pageToken", "CAoQAA")
				.param("order", "rating")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_r1lmv0299f8k() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "yDgLFOxnQ8Y")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "show")
				.param("videoDefinition", "any")
				.param("safeSearch", "none")
				.param("locationRadius", "5km")
				.param("regionCode", "it")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "any")
				.param("maxResults", "15")
				.param("videoCategoryId", "1")
				.param("videoDimension", "any")
				.param("relevanceLanguage", "en")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_t4knri85e59y() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "1m")
				.param("topicId", "/m/02vxn")
				.param("videoEmbeddable", "true")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("location", "35.681999,139.769254")
				.param("videoDefinition", "standard")
				.param("eventType", "upcoming")
				.param("videoSyndicated", "true")
				.param("safeSearch", "strict")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("order", "rating")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qhtct8qgkoqe() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "7m-NPuXPBqM")
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("type", "playlist")
				.param("locationRadius", "1500m")
				.param("q", "GoT reactions")
				.param("topicId", "/m/06ntj")
				.param("maxResults", "0")
				.param("videoCategoryId", "5")
				.param("videoDimension", "3d")
				.param("location", "37.392191,-5.995193")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
				.param("relevanceLanguage", "en")
				.param("order", "videoCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_skycrkemyjqd() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "any")
				.param("eventType", "completed")
				.param("type", "video,playlist")
				.param("videoSyndicated", "any")
				.param("videoLicense", "any")
				.param("locationRadius", "500km")
				.param("q", "soccer")
				.param("topicId", "/m/098wr")
				.param("maxResults", "0")
				.param("videoCategoryId", "2")
				.param("videoDimension", "any")
				.param("location", "37.392191,-5.995193")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_skpicm5jxiyg() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "show")
				.param("videoDefinition", "standard")
				.param("type", "channel")
				.param("videoLicense", "any")
				.param("regionCode", "pt")
				.param("topicId", "/m/04rlf")
				.param("videoDuration", "short")
				.param("videoCategoryId", "1")
				.param("videoDimension", "3d")
				.param("location", "-33.924278,18.424572")
				.param("pageToken", "CA8QAA")
				.param("order", "rating")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_skq1gar3yaes() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "none")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("eventType", "completed")
				.param("videoSyndicated", "any")
				.param("safeSearch", "moderate")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "5km")
				.param("regionCode", "es")
				.param("videoDuration", "any")
				.param("maxResults", "0")
				.param("videoCategoryId", "3")
				.param("pageToken", "CA8QAA")
				.param("relevanceLanguage", "de")
				.param("order", "viewCount")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_uvgw26lz2muq() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "1000km")
				.param("q", "late night show")
				.param("videoCaption", "none")
				.param("regionCode", "pt")
				.param("videoEmbeddable", "true")
				.param("maxResults", "50")
				.param("videoDimension", "3d")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("pageToken", "CAoQAA")
				.param("type", "channel")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_vevvikmevoz5() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("relatedToVideoId", "7m-NPuXPBqM")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "any")
				.param("type", "channel,playlist")
				.param("videoSyndicated", "any")
				.param("safeSearch", "strict")
				.param("videoLicense", "any")
				.param("regionCode", "de")
				.param("topicId", "/m/025zzc")
				.param("videoCategoryId", "4")
				.param("videoDimension", "any")
				.param("relevanceLanguage", "de")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_tnzigw9ty92c() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "show")
				.param("eventType", "live")
				.param("type", "video")
				.param("locationRadius", "1000km")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "any")
				.param("maxResults", "50")
				.param("videoCategoryId", "4")
				.param("pageToken", "CA8QAA")
				.param("relevanceLanguage", "es")
				.param("order", "title")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qe1lvhxs3qd1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "youtube")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "true")
				.param("maxResults", "15")
				.param("videoCategoryId", "1")
				.param("videoDimension", "3d")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CBQQAA")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("relevanceLanguage", "de")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_soccv8d4767o() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("eventType", "completed")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("locationRadius", "1000km")
				.param("q", "GoT reactions")
				.param("topicId", "/m/04rlf")
				.param("maxResults", "0")
				.param("videoDimension", "any")
				.param("pageToken", "CBkQAA")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1iv3sh5to2rea() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("relatedToVideoId", "usO_6-RuCrg")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "high")
				.param("locationRadius", "1500m")
				.param("regionCode", "us")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "3")
				.param("location", "-37.812746,144.961832")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("order", "date")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qe4bmr3nykx2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoSyndicated", "any")
				.param("safeSearch", "strict")
				.param("locationRadius", "1000km")
				.param("regionCode", "us")
				.param("maxResults", "50")
				.param("videoDimension", "2d")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CAoQAA")
				.param("relevanceLanguage", "es")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qhnc6etdqtdd() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("eventType", "completed")
				.param("type", "channel")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "creativeCommon")
				.param("q", "late night show")
				.param("topicId", "/m/025zzc")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "2")
				.param("videoDimension", "3d")
				.param("location", "-37.812746,144.961832")
				.param("pageToken", "CAoQAA")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
				.param("relevanceLanguage", "pt")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_trqse871innd() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "high")
				.param("eventType", "completed")
				.param("safeSearch", "moderate")
				.param("locationRadius", "1m")
				.param("regionCode", "pt")
				.param("videoEmbeddable", "true")
				.param("videoDimension", "2d")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CA8QAA")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
				.param("order", "relevance")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1h84v47vrp6id() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("channelType", "any")
				.param("videoDefinition", "standard")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("q", "GoT reactions")
				.param("regionCode", "pt")
				.param("topicId", "/m/02vxn")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CBkQAA")
				.param("order", "date")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_skmrcj23qgc4() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "show")
				.param("videoSyndicated", "any")
				.param("locationRadius", "5km")
				.param("regionCode", "it")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "medium")
				.param("videoCategoryId", "2")
				.param("pageToken", "CA8QAA")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
				.param("relevanceLanguage", "pt")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1iesqz1i2vr6q() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "GoT reactions")
				.param("topicId", "/m/06ntj")
				.param("maxResults", "50")
				.param("part", "snippet")
				.param("channelType", "any")
				.param("videoDefinition", "high")
				.param("pageToken", "CBkQAA")
				.param("videoSyndicated", "any")
				.param("videoLicense", "creativeCommon")
				.param("order", "title")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_tol8r8gxzb6s() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("relatedToVideoId", "TUJWx7vo44c")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("channelType", "any")
				.param("type", "video,playlist")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "1m")
				.param("topicId", "/m/04rlf")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "1")
				.param("videoDimension", "3d")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CBQQAA")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1hrriz12zin94() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("relatedToVideoId", "zZa8PFYtWr4")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "any")
				.param("eventType", "live")
				.param("videoSyndicated", "any")
				.param("videoDuration", "long")
				.param("maxResults", "5")
				.param("videoCategoryId", "4")
				.param("videoDimension", "2d")
				.param("location", "37.392191,-5.995193")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
				.param("relevanceLanguage", "de")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_1jicsdzaaqrtv() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("channelType", "show")
				.param("type", "video,channel,playlist")
				.param("videoSyndicated", "any")
				.param("safeSearch", "strict")
				.param("q", "soccer")
				.param("videoEmbeddable", "true")
				.param("maxResults", "30")
				.param("videoCategoryId", "3")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("relevanceLanguage", "pt")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void youtubeSearchListTest_qy4ednlz4b4x() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "live")
				.param("videoSyndicated", "true")
				.param("q", "GoT reactions")
				.param("regionCode", "es")
				.param("videoDuration", "long")
				.param("maxResults", "15")
				.param("videoCategoryId", "2")
				.param("pageToken", "CBkQAA")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
				.param("relevanceLanguage", "es")
				.param("order", "date")
			.when()
				.get("/search");

			response.then().log().all();
			response.then().statusCode(200);

			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}
