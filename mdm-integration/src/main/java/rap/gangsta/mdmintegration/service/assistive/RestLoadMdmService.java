package rap.gangsta.mdmintegration.service.assistive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rap.gangsta.general.dto.MdmItemDetailDtoResponse;
import rap.gangsta.general.dto.MdmItemDtoResponse;
import rap.gangsta.general.ifaces.mdm.MdmLoadService;
import rap.gangsta.mdmintegration.configuration.MdmPaths;

import java.net.URI;

@Service
public class RestLoadMdmService implements MdmLoadService {

    private final MdmPaths mdmPaths;
    private final RestTemplate rest;

    @Autowired
    public RestLoadMdmService(MdmPaths mdmPaths, RestTemplate rest) {
        this.mdmPaths = mdmPaths;
        this.rest = rest;
    }

    @Override
    public MdmItemDtoResponse loadItem() {
        return null;
    }

    @Override
    public MdmItemDetailDtoResponse loadItemDetail() {
        return null;
    }
}
