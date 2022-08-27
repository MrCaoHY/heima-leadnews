import com.heima.model.wemedia.pojos.WmNews;
import com.heima.utils.common.ProtostuffUtil;
import com.heima.wemedia.WemediaApplication;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: heima-leadnews
 * @description:
 * @author: CaoHaiyang
 * @create: 2022-08-23 02:03
 **/
@SpringBootTest(classes = WemediaApplication.class)
@RunWith(SpringRunner.class)
public class ProtoTest {

    @Test
    public void test(){
        WmNews wmNews = WmNews.builder().id(1).build();
        Schema schema = RuntimeSchema.getSchema(wmNews.getClass());
        byte[] bytes = ProtostuffIOUtil.toByteArray(wmNews, schema,
                LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));

        System.out.println(bytes);

    }

}
