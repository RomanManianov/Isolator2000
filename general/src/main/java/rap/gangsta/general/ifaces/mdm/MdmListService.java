package rap.gangsta.general.ifaces.mdm;

import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;

import java.util.List;

public interface MdmListService {

    List<MdmItemDtoResponse> listItem();

    List<MdmItemDetailDtoResponse> listItemDetail();
}
