package com.practice.flavors.flavorspractice.events;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by jrodriguez on 12/09/17.
 */

public class LoginEvents {

    private static LoginEvents loginEvents;
    private PublishSubject<Object> subject = PublishSubject.create();

    public static LoginEvents instanceOf(){
        if(loginEvents == null){
            loginEvents = new LoginEvents();
        }
        return loginEvents;
    }

    public void setData(Object object){
        subject.onNext(object);
    }

    public Observable<Object> getEvents(){
        return subject;
    }
}
