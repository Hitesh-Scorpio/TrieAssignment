package com.company;

/**
 * Created by hitesh on 17/11/17.
 */
public class TrieNode
{
  final int MAX_ALPHABETS = 26;
  TrieNode[] childNodes = new TrieNode[MAX_ALPHABETS];
  boolean isEndOfWord;
  String maxEndingHere;
  int lenMaxEndingHere;

  TrieNode(){
    isEndOfWord = false;
    for (int i = 0; i < MAX_ALPHABETS; i++)
      childNodes[i] = null;
    maxEndingHere = null;
    lenMaxEndingHere=0;
  }


}
