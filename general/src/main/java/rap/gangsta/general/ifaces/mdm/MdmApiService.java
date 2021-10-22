package rap.gangsta.general.ifaces.mdm;

import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;

import java.util.List;

/**
 * TODO: не реализованы методы: "attach", "orgCard", "orgFromCpe", "indexCatalogFields"
 * TODO: надо добавить ДТО запроса
 */
public interface MdmApiService {
    MdmItemDtoResponse loadItem();
    MdmItemDetailDtoResponse loadItemDetail();
    MdmItemDtoResponse createItem();
    MdmItemDetailDtoResponse createItemDetail();
    MdmItemDtoResponse updateItem();
    MdmItemDetailDtoResponse updateItemDetail();
    MdmItemDtoResponse deleteItem();
    MdmItemDetailDtoResponse deleteItemDetail();
    List<MdmItemDtoResponse> listItem();
    List<MdmItemDetailDtoResponse> listItemDetail();

}
