package test;

import java.util.*;
import java.io.*;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.*;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.base.Function;
import com.alibaba.fastjson.JSON;

public class Main {
    public static void httpTest() {
        String url = "http://www.google.com/search?q=httpClient";

        HttpClient client = HttpClientBuilder.create().build();
        System.out.println("client: " + client);
        // HttpGet request = new HttpGet(url);
        //
        // // add request header
        // // request.addHeader("User-Agent", USER_AGENT);
        // HttpResponse response = client.execute(request);
        //
        // System.out.println("Response Code : "
        // + response.getStatusLine().getStatusCode());
        //
        // BufferedReader rd = new BufferedReader(
        // new InputStreamReader(response.getEntity().getContent()));
        //
        // StringBuffer result = new StringBuffer();
        // String line = "";
        // while ((line = rd.readLine()) != null) {
        //     result.append(line);
        // }
    }

    public static void main(String[] args) {
        // HashMap<String, String> map1 = new HashMap<String, String>();
        // HashMap<String, String> map2 = new HashMap();
        // map2 = map1;
        Main.httpTest();
        Gson gson = new Gson();
        System.out.println("empty gson length: " + gson.toString().length());
        int a = 1;
        a = maybe ("abc") { 1, 2, 3};
        System.out.println("a: " + a);

        TreeNode root = new TreeNode();
        System.out.println(root.val);

        for (int i = 0; i < args.length; i++) {
            System.out.println("i: " + args[i]);
        }

        System.out.println("Hello World!");
    }
}
