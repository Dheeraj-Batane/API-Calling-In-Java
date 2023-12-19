package com.db.API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCalling {
	public static void main(String []arg) throws IOException, InterruptedException
	{
		var url="https://data.covid19india.org/v4/min/timeseries.min.json";
		var request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		var client=HttpClient.newBuilder().build();
		HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		String res=response.body();
		
		System.out.println(res);
		System.out.println(response.statusCode());
	}
}
