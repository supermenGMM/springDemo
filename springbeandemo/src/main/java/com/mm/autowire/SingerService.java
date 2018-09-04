package com.mm.autowire;

import com.mm.autowire.mystereotype.Format;
import com.mm.autowire.mystereotype.MyQulifier;
import com.mm.autowire.singer.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service
public class SingerService {
    @Autowired
    private Set<Singer> singers;




    @Autowired
    public SingerService(@Qualifier("bird") Singer singer) {
        this.singer = singer;
    }

  /*  @Autowired
    @Qualifier(value = "cat")//qulifirer*/
    private Singer singer;

    @Resource(name="bird")
    private  Singer singer2;

//    @Autowired
//    @MyQulifier(value = "pig",format = Format.HIG)
//    private Singer singer3;

    public void sing() {
        for (Singer singer :
                singers) {
            singer.sing();
        }
    }

    public void singerSing() {
        singer.sing();
    }
    public void singer2Sing() {
        singer2.sing();
    }
//    public void singer3Sing() {
//        singer3.sing();
//    }
}
