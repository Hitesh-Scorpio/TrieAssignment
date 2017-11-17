package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        String fileContent[] = {"the", "their", "theres", "mac" ,"macbook","macsboo"
          };

        Trie t = new Trie();

        // Construct trie
        int i;
        for (i = 0; i < fileContent.length ; i++)
            t.insert(fileContent[i]);
        while(true) {
            System.out.println("Enter the prefix (enter exit to exit): ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String prefix = in.readLine();
            if(prefix.equalsIgnoreCase("exit")) {
                System.exit(0);
            }
            String result = t.search(prefix);
            if (result.isEmpty() || result == null)
                System.out.println("No such string exists");
            else
                System.out.println("Biggest String with " + prefix + " is " + result);
        }

    }
}
