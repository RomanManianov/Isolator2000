package rap.gangsta.mdmintegration.service.assistive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.mdmintegration.configuration.MdmPaths;

import java.util.List;

@Service
@Qualifier("listMdmService")
public class ListMdmService implements AssistiveMdmService{

    private final MdmPaths mdmPaths;

    @Autowired
    public ListMdmService(MdmPaths mdmPaths) {
        this.mdmPaths = mdmPaths;
    }

    public List<MdmItemDtoResponse> listItem() {
        return null;
    }

    public List<MdmItemDetailDtoResponse> listItemDetail() {
        return null;
    }
}
