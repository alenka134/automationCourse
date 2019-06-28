package com.automatization.training.collections2.targil3;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class HTMLTextStorage {
    public static void main(String[] args) throws IOException {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String line;

        try {
            url = new URL("https://www.ynet.co.il");
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {
                // nothing to see here
            }
        }
        URL website = new URL("https://www.ynet.co.il");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("information.html");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
}
