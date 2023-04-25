package Rep1.review1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CafeService {
@Autowired
public cafeRepo crepo;
public cafeideas saveinfoo(cafeideas c)
{
	return crepo.save(c);
}
public List<cafeideas> getInfo()
{
	return cafeRepo.findAll();
}
}
