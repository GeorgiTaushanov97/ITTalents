package com.diary_online.diary_online.util;

import com.diary_online.diary_online.model.pojo.Diary;
import com.diary_online.diary_online.model.pojo.Section;
import com.diary_online.diary_online.model.pojo.User;

public class UtilUser {
    public static boolean isSectionMine(User user, int sectionId){

        for (Diary d : user.getDiaries()) {
            for (Section s: d.getSections()) {
                if(s.getId() == sectionId){
                  return true;
                }
            }
        }
        return false;
    }
}
