/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String1;

/**
 *
 * @author someya.sayeh
 */
public class makeTags {

    public String setTag(String n, String tag) {
        return "<" + n + tag + ">";
    }

    public String makeTags(String tag, String word) {

        String name = setTag("", tag) + word + setTag("/", tag);
        return name;

    }
}
