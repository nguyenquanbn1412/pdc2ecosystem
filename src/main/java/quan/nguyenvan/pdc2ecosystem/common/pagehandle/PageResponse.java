package quan.nguyenvan.pdc2ecosystem.common.pagehandle;

import java.util.List;

public interface PageResponse<T> {
    List<T> getContent();

    int getPageSize();

    int getTotalPages();

    int getTotalElements();

    int getCurrentPage();
}
