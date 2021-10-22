package rap.gangsta.mdmintegration.service;

import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.general.ifaces.mdm.MdmApiService;
import rap.gangsta.general.ifaces.mdm.MdmServiceManager;

import java.util.List;

@Service
public class RestMdmApiService implements MdmApiService {

    private final MdmServiceManager mdmServiceManager;

    public RestMdmApiService(MdmServiceManager mdmServiceManager) {
        this.mdmServiceManager = mdmServiceManager;
    }

    @Override
    public MdmItemDtoResponse loadItem() {
        return mdmServiceManager.getLoadService().loadItem();
    }

    @Override
    public MdmItemDetailDtoResponse loadItemDetail() {
        return mdmServiceManager.getLoadService().loadItemDetail();
    }

    @Override
    public MdmItemDtoResponse createItem() {
        return mdmServiceManager.getCreateService().createItem();
    }

    @Override
    public MdmItemDetailDtoResponse createItemDetail() {
        return mdmServiceManager.getCreateService().createItemDetail();
    }

    @Override
    public MdmItemDtoResponse updateItem() {
        return mdmServiceManager.getUpdateService().updateItem();
    }

    @Override
    public MdmItemDetailDtoResponse updateItemDetail() {
        return mdmServiceManager.getUpdateService().updateItemDetail();
    }

    @Override
    public MdmItemDtoResponse deleteItem() {
        return mdmServiceManager.getDeleteService().deleteItem();
    }

    @Override
    public MdmItemDetailDtoResponse deleteItemDetail() {
        return mdmServiceManager.getDeleteService().deleteItemDetail();
    }

    @Override
    public List<MdmItemDtoResponse> listItem() {
        return mdmServiceManager.getListService().listItem();
    }

    @Override
    public List<MdmItemDetailDtoResponse> listItemDetail() {
        return mdmServiceManager.getListService().listItemDetail();
    }
}
