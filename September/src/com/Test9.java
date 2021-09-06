package com;

import java.net.HttpURLConnection;
import java.net.URL;

public class Test9 {
	public static void URLExists(String targetUrl) {

		HttpURLConnection urlConnection;
		try {
			urlConnection = (HttpURLConnection) new URL(targetUrl).openConnection();
			urlConnection.setRequestMethod("HEAD");
			urlConnection.setConnectTimeout(500);
			urlConnection.setReadTimeout(5000);
			
			//System.out.println("Response Code => " + urlConnection.getResponseCode());
			//System.out.println("Response Msg => " + urlConnection.getResponseMessage());
		if(urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK)
		{
			System.out.println(targetUrl);
		}else
			
			System.out.println("error");
		} catch (Exception e) {
			System.err.println(e.getMessage() + "---" + targetUrl);
		}
	}
	public static void main(String[] args) {
		System.out.println("TESTING STARTED");
		URLExists("http://localhost:8080/");
		URLExists("https://google.com");
		URLExists("http://localhost:8081/");

	}

}
