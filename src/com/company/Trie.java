package com.company;

/**
 * Created by hitesh on 17/11/17.
 */
public class Trie
{
  TrieNode root;

  Trie()
  {
    root = new TrieNode();
  }

  void insert(String key)
  {
    int length = key.length();
    

    TrieNode tNode = root;

    for (int i = 0; i < length; i++)
    {
      int j = key.charAt(i) - 'a';
      if (tNode.childNodes[j] == null)
        tNode.childNodes[j] = new TrieNode();

      if (tNode.childNodes[j].lenMaxEndingHere < length)
      {
        tNode.childNodes[j].lenMaxEndingHere = length;
        tNode.childNodes[j].maxEndingHere = key;
      }
      tNode = tNode.childNodes[j];
    }

    // mark last node as leaf
    tNode.isEndOfWord = true;
  }

  String search(String key)
  {
    int length = key.length();

    TrieNode tNode = root;

    for ( int i = 0; i < length; i++)
    {

      if (tNode.childNodes[key.charAt(i) - 'a'] == null)
        return "";

      tNode = tNode.childNodes[key.charAt(i) - 'a'];
    }

    return tNode.maxEndingHere;
  }


}
