package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.fail;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class YouTubeWithIDLReasonerTest {

	private final String apiKey1 = "YOUR_API_KEY_1";
	private final String apiKey2 = "YOUR_API_KEY_2";

	@BeforeClass
 	public static void setUp() {
		RestAssured.baseURI = "https://www.googleapis.com/youtube/v3";
	}

	@Test
	public void youtubeSearchListTest_1iyc7dzurq2jn() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "any")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("locationRadius", "1500m")
				.param("q", "cats")
				.param("topicId", "/m/025zzc")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "2")
				.param("videoDimension", "2d")
				.param("location", "-33.924278,18.424572")
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
	public void youtubeSearchListTest_1h84tjzv1w0h2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("q", "soccer")
				.param("regionCode", "us")
				.param("maxResults", "5")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("pageToken", "CBkQAA")
				.param("type", "channel")
				.param("relevanceLanguage", "en")
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
	public void youtubeSearchListTest_1ibes41l0i350() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("eventType", "completed")
				.param("type", "video")
				.param("safeSearch", "strict")
				.param("locationRadius", "1m")
				.param("videoEmbeddable", "any")
				.param("maxResults", "30")
				.param("videoDimension", "2d")
				.param("location", "-33.924278,18.424572")
				.param("pageToken", "CBkQAA")
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
	public void youtubeSearchListTest_vf0v45e9pwl5() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("q", "late night show")
				.param("topicId", "/m/025zzc")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "standard")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "any")
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
	public void youtubeSearchListTest_rhald1drj3n6() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "1000km")
				.param("topicId", "/m/04rlf")
				.param("videoDimension", "3d")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("location", "-33.924278,18.424572")
				.param("videoDefinition", "standard")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "strict")
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
	public void youtubeSearchListTest_1iukflu100m76() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("q", "late night show")
				.param("videoCaption", "none")
				.param("videoEmbeddable", "any")
				.param("maxResults", "30")
				.param("videoCategoryId", "5")
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "strict")
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
	public void youtubeSearchListTest_uve7erks6hbo() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("regionCode", "de")
				.param("topicId", "/m/04rlf")
				.param("videoDuration", "short")
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "strict")
				.param("videoLicense", "creativeCommon")
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
	public void youtubeSearchListTest_1jed6tdxo5gz6() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("part", "snippet")
				.param("videoDefinition", "high")
				.param("eventType", "live")
				.param("type", "video")
				.param("videoLicense", "any")
				.param("locationRadius", "1m")
				.param("regionCode", "us")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "true")
				.param("maxResults", "0")
				.param("videoDimension", "any")
				.param("location", "-33.924278,18.424572")
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
	public void youtubeSearchListTest_u7ojlrl06s86() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("videoEmbeddable", "true")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("pageToken", "CAUQAA")
				.param("type", "video")
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
	public void youtubeSearchListTest_urjm7x5c2koi() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "high")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "youtube")
				.param("locationRadius", "500km")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "true")
				.param("maxResults", "15")
				.param("location", "35.681999,139.769254")
				.param("relevanceLanguage", "es")
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
	public void youtubeSearchListTest_1if132n7j2k3a() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoDuration", "long")
				.param("maxResults", "50")
				.param("videoCategoryId", "5")
				.param("videoDimension", "3d")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "moderate")
				.param("videoLicense", "youtube")
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
	public void youtubeSearchListTest_urmurc6er0pu() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("q", "music")
				.param("regionCode", "es")
				.param("videoDuration", "any")
				.param("videoCategoryId", "4")
				.param("videoDimension", "any")
				.param("pageToken", "CAoQAA")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
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
	public void youtubeSearchListTest_rl8dg6kmlkkk() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "any")
				.param("eventType", "live")
				.param("type", "video")
				.param("locationRadius", "1m")
				.param("q", "soccer")
				.param("regionCode", "it")
				.param("videoCategoryId", "4")
				.param("location", "-37.812746,144.961832")
				.param("pageToken", "CA8QAA")
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
	public void youtubeSearchListTest_uvhfjzw670is() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "completed")
				.param("type", "video")
				.param("safeSearch", "strict")
				.param("q", "soccer")
				.param("regionCode", "it")
				.param("videoEmbeddable", "true")
				.param("videoDimension", "3d")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
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
	public void youtubeSearchListTest_1iv0zwxxp7far() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoDuration", "medium")
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("safeSearch", "none")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
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
	public void youtubeSearchListTest_u8b8wly6hb1x() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("videoLicense", "any")
				.param("regionCode", "pt")
				.param("topicId", "/m/025zzc")
				.param("videoDuration", "any")
				.param("videoDimension", "any")
				.param("pageToken", "CBkQAA")
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
	public void youtubeSearchListTest_sl65e04m6blj() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("videoDefinition", "high")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
				.param("videoLicense", "any")
				.param("locationRadius", "1500m")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "true")
				.param("maxResults", "5")
				.param("videoCategoryId", "4")
				.param("location", "-33.924278,18.424572")
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
	public void youtubeSearchListTest_r1a3v2bvntpt() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "high")
				.param("eventType", "live")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("locationRadius", "5km")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "any")
				.param("maxResults", "15")
				.param("location", "-37.812746,144.961832")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
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
	public void youtubeSearchListTest_1if114xsdijp2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("regionCode", "de")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "any")
				.param("videoDimension", "any")
				.param("part", "snippet")
				.param("type", "video")
				.param("safeSearch", "strict")
				.param("videoLicense", "any")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
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
	public void youtubeSearchListTest_uvbdzx12vlf9() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "any")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("safeSearch", "moderate")
				.param("locationRadius", "500km")
				.param("q", "cats")
				.param("regionCode", "es")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "true")
				.param("maxResults", "50")
				.param("location", "37.42307,-122.08427")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
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
	public void youtubeSearchListTest_sobujwj8soxc() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("eventType", "completed")
				.param("type", "video")
				.param("safeSearch", "moderate")
				.param("locationRadius", "1000km")
				.param("q", "cats")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("maxResults", "50")
				.param("location", "-33.924278,18.424572")
				.param("pageToken", "CAoQAA")
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
	public void youtubeSearchListTest_u8b8420gmrtt() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("type", "video")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "1m")
				.param("q", "soccer")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "3")
				.param("videoDimension", "3d")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CBQQAA")
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
	public void youtubeSearchListTest_qhhs8oe082m1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("type", "video")
				.param("locationRadius", "1000km")
				.param("q", "late night show")
				.param("regionCode", "us")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("videoCategoryId", "2")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CBkQAA")
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
	public void youtubeSearchListTest_rkzm5bp2eb8m() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
				.param("locationRadius", "1500m")
				.param("q", "late night show")
				.param("regionCode", "pt")
				.param("topicId", "/m/02vxn")
				.param("videoDimension", "2d")
				.param("location", "37.42307,-122.08427")
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
	public void youtubeSearchListTest_tnzkhgln8qbb() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("topicId", "/m/06ntj")
				.param("videoEmbeddable", "true")
				.param("maxResults", "30")
				.param("videoDimension", "3d")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("type", "video")
				.param("safeSearch", "strict")
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
	public void youtubeSearchListTest_r1a2m8cbrk1k() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "strict")
				.param("locationRadius", "1000km")
				.param("regionCode", "pt")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "4")
				.param("location", "37.42307,-122.08427")
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
	public void youtubeSearchListTest_qxl14ea4sxgi() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "high")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
				.param("locationRadius", "1m")
				.param("q", "soccer")
				.param("regionCode", "it")
				.param("topicId", "/m/06ntj")
				.param("videoCategoryId", "3")
				.param("videoDimension", "3d")
				.param("location", "37.392191,-5.995193")
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
	public void youtubeSearchListTest_1ibh16m4x8gu0() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("q", "late night show")
				.param("videoEmbeddable", "true")
				.param("videoDimension", "2d")
				.param("part", "snippet")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "strict")
				.param("videoLicense", "any")
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
	public void youtubeSearchListTest_sl6pnnss92zp() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("eventType", "completed")
				.param("type", "video")
				.param("videoLicense", "any")
				.param("locationRadius", "1m")
				.param("q", "GoT reactions")
				.param("regionCode", "pt")
				.param("videoCategoryId", "1")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CAUQAA")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
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
	public void youtubeSearchListTest_urgtcgddui49() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("locationRadius", "1500m")
				.param("q", "soccer")
				.param("maxResults", "5")
				.param("videoCategoryId", "5")
				.param("videoDimension", "3d")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CAoQAA")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
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
	public void youtubeSearchListTest_qxfhvz0vrrjt() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "completed")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("videoLicense", "youtube")
				.param("locationRadius", "1000km")
				.param("videoDuration", "long")
				.param("videoDimension", "3d")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CBkQAA")
				.param("relevanceLanguage", "en")
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
	public void youtubeSearchListTest_s1efz7ismkoj() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "any")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoLicense", "any")
				.param("locationRadius", "500km")
				.param("maxResults", "50")
				.param("videoCategoryId", "4")
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
	public void youtubeSearchListTest_ure16fumkn5g() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("locationRadius", "5km")
				.param("q", "music")
				.param("regionCode", "us")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "long")
				.param("videoDimension", "3d")
				.param("location", "37.42307,-122.08427")
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
	public void youtubeSearchListTest_1iv12c1iky0xe() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("eventType", "completed")
				.param("type", "video")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "1500m")
				.param("q", "cats")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "5")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CA8QAA")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
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
	public void youtubeSearchListTest_1iv6jv6t1w3sj() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "any")
				.param("locationRadius", "1m")
				.param("topicId", "/m/098wr")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("videoCategoryId", "4")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CBQQAA")
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
	public void youtubeSearchListTest_rh7tl3y0b882() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("videoLicense", "youtube")
				.param("locationRadius", "1500m")
				.param("regionCode", "es")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "long")
				.param("maxResults", "30")
				.param("videoDimension", "any")
				.param("location", "-33.924278,18.424572")
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
	public void youtubeSearchListTest_s10j5z2i8wms() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "standard")
				.param("eventType", "completed")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "strict")
				.param("regionCode", "it")
				.param("topicId", "/m/098wr")
				.param("videoEmbeddable", "any")
				.param("maxResults", "0")
				.param("videoCategoryId", "5")
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
	public void youtubeSearchListTest_t8cdzhot3vqd() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("part", "snippet")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("videoLicense", "youtube")
				.param("locationRadius", "1m")
				.param("q", "late night show")
				.param("regionCode", "pt")
				.param("videoDuration", "short")
				.param("maxResults", "5")
				.param("videoCategoryId", "3")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CA8QAA")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
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
	public void youtubeSearchListTest_u7zkr98wxgl4() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "1000km")
				.param("videoCaption", "closedCaption")
				.param("regionCode", "de")
				.param("videoDuration", "medium")
				.param("maxResults", "5")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("location", "35.681999,139.769254")
				.param("eventType", "completed")
				.param("type", "video")
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
	public void youtubeSearchListTest_1huxp562kky0p() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "any")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("videoDefinition", "high")
				.param("eventType", "completed")
				.param("type", "video")
				.param("q", "music")
				.param("regionCode", "es")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "long")
				.param("maxResults", "5")
				.param("pageToken", "CAUQAA")
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
	public void youtubeSearchListTest_u8ap11sb2v5e() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("q", "late night show")
				.param("videoCaption", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
				.param("relevanceLanguage", "pt")
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
	public void youtubeSearchListTest_1hrayzb7nunvo() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "none")
				.param("videoDuration", "any")
				.param("maxResults", "5")
				.param("videoCategoryId", "4")
				.param("part", "snippet")
				.param("eventType", "completed")
				.param("type", "video")
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
	public void youtubeSearchListTest_ubrx9k9qna78() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "1500m")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("maxResults", "30")
				.param("videoCategoryId", "4")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("location", "35.681999,139.769254")
				.param("type", "video")
				.param("videoLicense", "any")
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
	public void youtubeSearchListTest_vbsg75skazj5() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("eventType", "completed")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("q", "soccer")
				.param("regionCode", "es")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "any")
				.param("maxResults", "0")
				.param("videoCategoryId", "3")
				.param("videoDimension", "2d")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
				.param("relevanceLanguage", "es")
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
	public void youtubeSearchListTest_uv95btftnku0() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("locationRadius", "500km")
				.param("videoCaption", "none")
				.param("regionCode", "es")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "any")
				.param("videoCategoryId", "5")
				.param("videoDimension", "2d")
				.param("part", "snippet")
				.param("location", "-37.812746,144.961832")
				.param("type", "video")
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
	public void youtubeSearchListTest_ubonhitws9k1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
				.param("videoLicense", "any")
				.param("locationRadius", "5km")
				.param("q", "cats")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "3")
				.param("location", "-33.924278,18.424572")
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
	public void youtubeSearchListTest_1ji77o2o98ieq() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("regionCode", "de")
				.param("maxResults", "0")
				.param("videoDimension", "any")
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("pageToken", "CA8QAA")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
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
	public void youtubeSearchListTest_u7ukp4m1v4mu() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoCaption", "closedCaption")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "standard")
				.param("eventType", "completed")
				.param("type", "video")
				.param("locationRadius", "1m")
				.param("q", "soccer")
				.param("topicId", "/m/06ntj")
				.param("location", "37.392191,-5.995193")
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
	public void youtubeSearchListTest_1hbd830crccis() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("safeSearch", "moderate")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "1500m")
				.param("videoDuration", "short")
				.param("maxResults", "15")
				.param("videoCategoryId", "2")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CBQQAA")
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
	public void youtubeSearchListTest_vf1e7ncngoqa() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey1)
				.param("q", "music")
				.param("maxResults", "5")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "live")
				.param("pageToken", "CA8QAA")
				.param("type", "video")
				.param("safeSearch", "none")
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
	public void youtubeSearchListTest_tol92sgayjw5() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("locationRadius", "1000km")
				.param("regionCode", "pt")
				.param("videoDuration", "medium")
				.param("maxResults", "5")
				.param("videoCategoryId", "1")
				.param("videoDimension", "3d")
				.param("location", "37.42307,-122.08427")
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
	public void youtubeSearchListTest_u8aql48xb039() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("locationRadius", "500km")
				.param("q", "GoT reactions")
				.param("regionCode", "us")
				.param("videoDuration", "long")
				.param("maxResults", "50")
				.param("videoCategoryId", "5")
				.param("videoDimension", "2d")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CAUQAA")
				.param("relevanceLanguage", "de")
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
	public void youtubeSearchListTest_qe9wcigt3nll() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "1500m")
				.param("topicId", "/m/025zzc")
				.param("videoCategoryId", "5")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CBkQAA")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
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
	public void youtubeSearchListTest_qe6mptxx3eig() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("videoDefinition", "high")
				.param("eventType", "live")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "strict")
				.param("videoLicense", "any")
				.param("locationRadius", "1m")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "true")
				.param("location", "-37.812746,144.961832")
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
	public void youtubeSearchListTest_1ibc16uq7nj91() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "high")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "500km")
				.param("regionCode", "us")
				.param("videoDuration", "short")
				.param("videoCategoryId", "5")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CBQQAA")
				.param("relevanceLanguage", "en")
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
	public void youtubeSearchListTest_rh5ivqc5nvaq() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "video")
				.param("safeSearch", "strict")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "500km")
				.param("videoDuration", "any")
				.param("videoCategoryId", "5")
				.param("videoDimension", "2d")
				.param("location", "-37.812746,144.961832")
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
	public void youtubeSearchListTest_tocumo7j5bnb() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("eventType", "live")
				.param("type", "video")
				.param("videoLicense", "any")
				.param("locationRadius", "1m")
				.param("regionCode", "pt")
				.param("videoEmbeddable", "any")
				.param("maxResults", "15")
				.param("videoCategoryId", "4")
				.param("location", "35.681999,139.769254")
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
	public void youtubeSearchListTest_r1ctm9fymy49() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "video")
				.param("safeSearch", "none")
				.param("videoLicense", "youtube")
				.param("locationRadius", "5km")
				.param("q", "late night show")
				.param("regionCode", "de")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "5")
				.param("videoDimension", "2d")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CAoQAA")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
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
	public void youtubeSearchListTest_t4hshgcy9nxi() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "1500m")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "medium")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CBkQAA")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
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
	public void youtubeSearchListTest_uv8kqt17ku3m() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoDuration", "any")
				.param("maxResults", "30")
				.param("videoCategoryId", "2")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("eventType", "completed")
				.param("pageToken", "CA8QAA")
				.param("type", "video")
				.param("videoLicense", "creativeCommon")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
				.param("relevanceLanguage", "it")
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
	public void youtubeSearchListTest_toddsr9yd640() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "none")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "any")
				.param("eventType", "live")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("videoLicense", "any")
				.param("locationRadius", "1500m")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "short")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CBQQAA")
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
	public void youtubeSearchListTest_1jed7lmf2i438() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoDuration", "any")
				.param("videoCategoryId", "3")
				.param("videoDimension", "2d")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("videoLicense", "creativeCommon")
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
	public void youtubeSearchListTest_1jew3rxf1phdi() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "5km")
				.param("topicId", "/m/098wr")
				.param("videoDimension", "any")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("location", "35.681999,139.769254")
				.param("videoDefinition", "any")
				.param("type", "video")
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
	public void youtubeSearchListTest_1hb7mlf0crlnl() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("eventType", "live")
				.param("type", "video")
				.param("safeSearch", "none")
				.param("videoLicense", "any")
				.param("locationRadius", "1m")
				.param("regionCode", "es")
				.param("videoDuration", "medium")
				.param("maxResults", "15")
				.param("videoCategoryId", "3")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CBkQAA")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
				.param("relevanceLanguage", "es")
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
	public void youtubeSearchListTest_1ies767y1l4c5() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "1m")
				.param("q", "music")
				.param("videoCaption", "closedCaption")
				.param("regionCode", "it")
				.param("videoDuration", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("location", "37.42307,-122.08427")
				.param("videoDefinition", "any")
				.param("eventType", "completed")
				.param("type", "video")
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
	public void youtubeSearchListTest_1ib0exluc03lg() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("videoEmbeddable", "any")
				.param("videoCategoryId", "1")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "video")
				.param("safeSearch", "moderate")
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
	public void youtubeSearchListTest_1ji77cu7r2mgi() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("type", "video")
				.param("videoLicense", "youtube")
				.param("locationRadius", "1500m")
				.param("regionCode", "it")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "long")
				.param("maxResults", "5")
				.param("videoCategoryId", "5")
				.param("videoDimension", "2d")
				.param("location", "37.392191,-5.995193")
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
	public void youtubeSearchListTest_ubonhn30jd4j() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
				.param("videoLicense", "any")
				.param("locationRadius", "5km")
				.param("regionCode", "es")
				.param("topicId", "/m/025zzc")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("maxResults", "0")
				.param("videoDimension", "2d")
				.param("location", "37.392191,-5.995193")
				.param("pageToken", "CBkQAA")
				.param("channelId", "UCJ0uqCI0Vqr2Rrt1HseGirg")
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
	public void youtubeSearchListTest_t4l424hjc46w() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "strict")
				.param("locationRadius", "1m")
				.param("regionCode", "us")
				.param("videoDuration", "any")
				.param("videoCategoryId", "5")
				.param("videoDimension", "2d")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CAUQAA")
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
	public void youtubeSearchListTest_uv94jjbvko6e() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "none")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "any")
				.param("type", "video")
				.param("locationRadius", "1m")
				.param("videoEmbeddable", "true")
				.param("videoCategoryId", "3")
				.param("videoDimension", "any")
				.param("location", "37.392191,-5.995193")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
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
	public void youtubeSearchListTest_1jyirhh8gq90w() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "standard")
				.param("eventType", "completed")
				.param("type", "video")
				.param("videoLicense", "creativeCommon")
				.param("regionCode", "us")
				.param("topicId", "/m/098wr")
				.param("videoDuration", "any")
				.param("videoEmbeddable", "true")
				.param("maxResults", "0")
				.param("pageToken", "CA8QAA")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
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
	public void youtubeSearchListTest_rl5lzp6q7zg9() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("type", "video")
				.param("safeSearch", "none")
				.param("locationRadius", "1500m")
				.param("topicId", "/m/04rlf")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("maxResults", "0")
				.param("location", "-37.812746,144.961832")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
				.param("relevanceLanguage", "it")
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
	public void youtubeSearchListTest_t4nwmecra2if() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("part", "snippet")
				.param("videoDefinition", "high")
				.param("type", "video")
				.param("videoLicense", "youtube")
				.param("locationRadius", "1500m")
				.param("regionCode", "us")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("videoCategoryId", "5")
				.param("videoDimension", "3d")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CAoQAA")
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
	public void youtubeSearchListTest_1jefg9xy67hib() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "1m")
				.param("videoCaption", "closedCaption")
				.param("regionCode", "de")
				.param("videoCategoryId", "5")
				.param("videoDimension", "3d")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("location", "37.392191,-5.995193")
				.param("videoDefinition", "standard")
				.param("pageToken", "CAoQAA")
				.param("type", "video")
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
	public void youtubeSearchListTest_qxqklfky47jo() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "none")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("safeSearch", "strict")
				.param("q", "cats")
				.param("regionCode", "es")
				.param("topicId", "/m/025zzc")
				.param("videoDuration", "short")
				.param("videoDimension", "any")
				.param("pageToken", "CBQQAA")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
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
	public void youtubeSearchListTest_1ib0yhk38uk4l() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("type", "video")
				.param("safeSearch", "strict")
				.param("videoLicense", "any")
				.param("locationRadius", "500km")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "any")
				.param("videoDimension", "2d")
				.param("location", "35.681999,139.769254")
				.param("pageToken", "CBkQAA")
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
	public void youtubeSearchListTest_1hrosd0po1g6o() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "soccer")
				.param("regionCode", "de")
				.param("videoCategoryId", "2")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("type", "video")
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
	public void youtubeSearchListTest_s15n4efzyov6() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "any")
				.param("part", "snippet")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("videoLicense", "any")
				.param("locationRadius", "1500m")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("maxResults", "0")
				.param("videoDimension", "2d")
				.param("location", "37.392191,-5.995193")
				.param("channelId", "UCMtFAi84ehTSYSE9XoHefig")
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
	public void youtubeSearchListTest_s10kc0f5pxdk() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("part", "snippet")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("videoLicense", "youtube")
				.param("q", "late night show")
				.param("regionCode", "de")
				.param("topicId", "/m/04rlf")
				.param("videoEmbeddable", "any")
				.param("pageToken", "CBkQAA")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
				.param("relevanceLanguage", "en")
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
	public void youtubeSearchListTest_soko494nqeyd() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("regionCode", "it")
				.param("topicId", "/m/025zzc")
				.param("videoEmbeddable", "any")
				.param("videoDimension", "2d")
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "strict")
				.param("videoLicense", "creativeCommon")
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
	public void youtubeSearchListTest_1ib0gvrcs7ozb() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("videoLicense", "creativeCommon")
				.param("locationRadius", "1500m")
				.param("q", "music")
				.param("regionCode", "es")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("videoCategoryId", "3")
				.param("videoDimension", "2d")
				.param("location", "-33.924278,18.424572")
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
	public void youtubeSearchListTest_urmd7qpkk9iw() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "none")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("videoDefinition", "any")
				.param("eventType", "live")
				.param("type", "video")
				.param("safeSearch", "none")
				.param("locationRadius", "1m")
				.param("q", "soccer")
				.param("regionCode", "us")
				.param("videoEmbeddable", "any")
				.param("location", "-33.924278,18.424572")
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
	public void youtubeSearchListTest_qhkkbw9sz886() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("eventType", "live")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "strict")
				.param("videoLicense", "youtube")
				.param("regionCode", "de")
				.param("topicId", "/m/04rlf")
				.param("videoDuration", "any")
				.param("maxResults", "50")
				.param("videoCategoryId", "2")
				.param("videoDimension", "3d")
				.param("pageToken", "CAoQAA")
				.param("channelId", "UClzCn8DxRSCuMFv_WfzkcrQ")
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
	public void youtubeSearchListTest_qhter039dusw() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "soccer")
				.param("videoDuration", "short")
				.param("videoEmbeddable", "true")
				.param("maxResults", "0")
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("safeSearch", "none")
				.param("videoLicense", "creativeCommon")
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
	public void youtubeSearchListTest_t4c9954hvfp4() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "1m")
				.param("videoDuration", "long")
				.param("videoDimension", "3d")
				.param("part", "snippet")
				.param("location", "37.42307,-122.08427")
				.param("pageToken", "CAUQAA")
				.param("type", "video")
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
	public void youtubeSearchListTest_s1jxnm7el1sz() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "GoT reactions")
				.param("regionCode", "it")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "true")
				.param("maxResults", "30")
				.param("videoCategoryId", "1")
				.param("part", "snippet")
				.param("eventType", "upcoming")
				.param("type", "video")
				.param("videoSyndicated", "true")
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
	public void youtubeSearchListTest_1jy5gvnspn80z() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "none")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("videoLicense", "creativeCommon")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("videoDimension", "any")
				.param("pageToken", "CAUQAA")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
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
	public void youtubeSearchListTest_ts2eiqpcde0l() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "GoT reactions")
				.param("maxResults", "30")
				.param("videoDimension", "3d")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("eventType", "live")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("videoLicense", "youtube")
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
	public void youtubeSearchListTest_1jecpabur5co2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "none")
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("videoDefinition", "high")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "none")
				.param("videoLicense", "any")
				.param("q", "music")
				.param("regionCode", "us")
				.param("videoDuration", "medium")
				.param("videoDimension", "any")
				.param("channelId", "UCvosUrZ7hXpzAyobhfztg4w")
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
	public void youtubeSearchListTest_s18w1uwn1tmh() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "cats")
				.param("regionCode", "de")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "true")
				.param("videoDimension", "3d")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("type", "video")
				.param("videoLicense", "youtube")
				.param("channelId", "UCDwjiSF4qEb3aeT3ZLkPc_Q")
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
	public void youtubeSearchListTest_qhnci533ooxc() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "closedCaption")
				.param("maxResults", "30")
				.param("videoCategoryId", "3")
				.param("part", "snippet")
				.param("videoDefinition", "standard")
				.param("eventType", "completed")
				.param("pageToken", "CA8QAA")
				.param("type", "video")
				.param("videoLicense", "youtube")
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
	public void youtubeSearchListTest_1hrj9leup0go6() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoType", "episode")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "standard")
				.param("eventType", "completed")
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("safeSearch", "moderate")
				.param("q", "cats")
				.param("regionCode", "es")
				.param("topicId", "/m/04rlf")
				.param("videoEmbeddable", "true")
				.param("videoDimension", "3d")
				.param("pageToken", "CAoQAA")
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
	public void youtubeSearchListTest_r17bb2bb3kgz() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("maxResults", "30")
				.param("videoCategoryId", "2")
				.param("videoDimension", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "any")
				.param("pageToken", "CBkQAA")
				.param("type", "video")
				.param("videoLicense", "youtube")
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
	public void youtubeSearchListTest_to4mfa0a3tiq() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "late night show")
				.param("regionCode", "pt")
				.param("videoDuration", "medium")
				.param("videoEmbeddable", "any")
				.param("videoDimension", "3d")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("eventType", "completed")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("videoLicense", "creativeCommon")
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
	public void youtubeSearchListTest_vey4iqcf1c8l() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "1500m")
				.param("videoEmbeddable", "true")
				.param("maxResults", "50")
				.param("videoCategoryId", "2")
				.param("videoDimension", "any")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("location", "37.392191,-5.995193")
				.param("videoDefinition", "standard")
				.param("type", "video")
				.param("safeSearch", "moderate")
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
	public void youtubeSearchListTest_qhq3yejjnq5s() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "500km")
				.param("topicId", "/m/02vxn")
				.param("videoDuration", "long")
				.param("videoType", "any")
				.param("part", "snippet")
				.param("forDeveloper", "false")
				.param("location", "35.681999,139.769254")
				.param("videoDefinition", "standard")
				.param("eventType", "live")
				.param("type", "video")
				.param("videoSyndicated", "true")
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
	public void youtubeSearchListTest_1jyit1nm2zcc8() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("videoCaption", "any")
				.param("topicId", "/m/06ntj")
				.param("videoDuration", "medium")
				.param("maxResults", "50")
				.param("videoDimension", "3d")
				.param("videoType", "movie")
				.param("part", "snippet")
				.param("forDeveloper", "true")
				.param("videoDefinition", "high")
				.param("type", "video")
				.param("videoSyndicated", "any")
				.param("safeSearch", "none")
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
	public void youtubeSearchListTest_s1b5kpfebk2t() {
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
				.param("type", "video")
				.param("videoSyndicated", "true")
				.param("videoLicense", "any")
				.param("q", "soccer")
				.param("regionCode", "es")
				.param("topicId", "/m/098wr")
				.param("videoEmbeddable", "true")
				.param("maxResults", "0")
				.param("videoCategoryId", "3")
				.param("pageToken", "CBkQAA")
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
	public void youtubeSearchListTest_1jyoc74ai0xmh() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("q", "soccer")
				.param("regionCode", "it")
				.param("videoDuration", "long")
				.param("videoEmbeddable", "any")
				.param("maxResults", "5")
				.param("videoDimension", "2d")
				.param("part", "snippet")
				.param("pageToken", "CBQQAA")
				.param("type", "video")
				.param("safeSearch", "strict")
				.param("videoLicense", "any")
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
	public void youtubeSearchListTest_1iv9b8raft205() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.param("key", apiKey2)
				.param("locationRadius", "500km")
				.param("q", "GoT reactions")
				.param("maxResults", "15")
				.param("part", "snippet")
				.param("location", "-33.924278,18.424572")
				.param("videoDefinition", "any")
				.param("eventType", "live")
				.param("pageToken", "CAoQAA")
				.param("type", "video")
				.param("videoSyndicated", "true")
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

}
