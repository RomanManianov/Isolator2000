package rap.gangsta.rabbit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import rap.gangsta.general.dto.ItemDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus {
    private ItemDto itemDto;
    private String status;
    private String message;
}
