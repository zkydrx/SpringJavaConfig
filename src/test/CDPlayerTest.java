package test;

import com.spring.bean.demo.soundSystem.CDPlayerConfig;
import com.spring.bean.demo.soundSystem.CompactDisc;
import com.spring.bean.demo.soundSystem.SgtPeppers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ZKY on 2017-07-29 17:25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest
{
    @Autowired
    private CompactDisc cd;
    @Autowired
    private SgtPeppers sgtPeppers;
    @Test
    public void cdShoudNotBeNull()
    {
       assertNotNull(cd);
       sgtPeppers.play();
    }
}
