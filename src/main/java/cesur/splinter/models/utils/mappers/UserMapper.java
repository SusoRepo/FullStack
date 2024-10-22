package cesur.splinter.models.utils.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;

import cesur.splinter.models.User;
import cesur.splinter.models.dto.UserDTO;

@Mapper
public interface UserMapper {
    UserMapper instance = Mappers.getMapper(UserMapper.class);
    // condicion base
    UserDTO userTouUserDTO(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "lastConnection", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)   
    User userDTOToUserDB(UserDTO userDTO);

    @Mapping(target = "id", ignore = true)
    User userDTOToUserWithoutId(UserDTO userDTO);
    // condiciones complejas
    @Mapping(target = "password", ignore = true)
    UserDTO userToUserDTOWithoutPassword(User user);

    

    // @Mapping(target = "lastconnection", qualifiedByName = "calculateLastConnection")
    // UserDTO userToUserDTOLastConnection(User user);

    default LocalDateTime calculateLastConnection(){
        return LocalDateTime.now();
    }
}





