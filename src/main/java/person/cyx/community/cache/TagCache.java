package person.cyx.community.cache;

import org.apache.commons.lang3.StringUtils;
import person.cyx.community.dto.TagDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-14 16:11
 **/
public class TagCache {
    public static List<TagDTO> get(){
        ArrayList<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO program = new TagDTO();
        program.setCategoryName("开发语言");
        program.setTags(Arrays.asList("javascript","php","css","html","java","c","c++","python"));
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("平台框架");
        framework.setTags(Arrays.asList("spring","springboot","struts","koa","yii"));
        tagDTOS.add(framework);

        TagDTO db = new TagDTO();
        db.setCategoryName("数据库");
        db.setTags(Arrays.asList("mysql","redis","sql","sqlserver","oracle"));
        tagDTOS.add(db);
        return tagDTOS;
    }

    public static String filterInvalid(String tags){
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();

        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> !tagList.contains(t)).collect(Collectors.joining(","));

        return invalid;
    }
}
