package person.cyx.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-09-30 14:34
 **/
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();

    public void setPagination(Integer count, Integer page, Integer size) {
        Integer totalPage;
        if (count % size == 0){
            totalPage = count / size;
        }else {
            totalPage = count / size + 1;
        }

        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - 1 > 0){
                pages.add(page - i,0);
            }
            if (page + 1 <= count){
                pages.add(page + i);
            }
        }

        //是否展示上一页
        if (page == 1){
            showPrevious = false;
        }else{
            showPrevious = true;
        }
        //是否展示下一页
        if (page == totalPage){
            showNext = false;
        }else{
            showNext = true;
        }
        //是否展示第一页
        if (pages.contains(1)){
            showFirstPage = false;
        }else{
            showFirstPage = true;
        }
        //是否展示尾页
        if (pages.contains(totalPage)){
            showEndPage = false;
        }else{
            showEndPage = true;
        }
    }
}
