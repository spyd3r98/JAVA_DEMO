package javacodechecker; 

public class  DirectObjectReference{
	@RequestMapping(value = "/records/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@Timed
	public ResponseEntity < Record > get(@PathVariable Long id) {
	return log.debug("REST request to get record" + id);
	}
	
}
