package com.wisdom.easy;
import java.util.ArrayList;
import java.util.List;
/**
 *  给一个词典，找出其中所有最长的单词。
 *
 * 样例:
 * 在词典
 * {
 *   "dog",
 *   "google",
 *   "facebook",
 *   "internationalization",
 *   "blabla"
 * }
 * 中, 最长的单词集合为 ["internationalization"];
 * 在词典
 * {
 *   "like",
 *   "love",
 *   "hate",
 *   "yes"
 * }
 * 中，最长的单词集合为 ["like", "love", "hate"]
 * [挑战] : 遍历两次的办法很容易想到，如果只遍历一次你有没有什么好办法？
 */
public class LongestWords {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
	  public static void main(String[] args) {
		    String[] dic = {"zscqe","ahcqm","sljum","jluqh","rowlv"};
		    List<String> list = longestWords(dic);
		    System.out.println(list);
	  }
    private static List<String> longestWords(String[] dictionary) {
        // write your code here
    	  List<String> list = new ArrayList<>();
    	  if (dictionary.length == 0) {
    		    return list;
    	  }
    	  list.add(dictionary[0]);
    	  for (int i = 1; i < dictionary.length; i++) {
    		    if(dictionary[i].length() > list.get(list.size() - 1).length()) {
    			      list.clear();
    			      list.add(dictionary[i]);
    		    } else if (dictionary[i].length() == list.get(list.size() - 1).length()) {
    			      list.add(dictionary[i]);
    		    } else {
    			      continue;
    		    }
    	  }
    	  return list;
    }
}
