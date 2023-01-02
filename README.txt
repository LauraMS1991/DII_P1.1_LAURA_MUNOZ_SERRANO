PRACTICA 1.2 DESARROLLO DE INTERFACES


Para la realización de esta práctica lo primero que he hecho ha sido crear un "Dynamic Web Project".

Por un lado he creado un paquete que contiene los servlet. En concreto he creado tres: 

- Agenda. A este le llegan los datos introducidos en el formulario inicial a traves del metodo POST. De forma que almacena el nuevo usuario y enviar la lista de los mismos al index.jsp 
	donde se mostrara la lista de los mismos.

-EditarContacto. A este servlet le llegan los datos introducidos a traves del jsp editar. En el metodo post se recogen estos datos, busca el contacto con ese id, y modifica sus atributos
	 por los nuevos introducidos. Al guardar estas modificaciones volvemos al index con los datos actualizados.

- EliminarContacto. A este servlet le llega los datos del jsp eliminarUsuario a traves del metodo get. Cuando pulsamos el bototn eliminar, nos lleva al jsp que nos pregutna que si deseamos eliminar
al contacto seleccionado.Si la respuesta es afirmativa los datos son enviados al servlet que se encargara de buscar el contacto con ese id y eliminarlo para despues voler al index principal donde ya no se mstrara el mismo.

Por otro lado he creado otro paquete donde nos encontramos dos clases:

- La clase contacto con los atributos necesarios para almacenar los datos con sus correspondientes métodos de acceso (set y get), para poder operar con ellos posteriormente. 
- La clase contactoDAO para guardar la lista de ususarios puesto que si metemos el ArrayList en uno de los servlet no podremos utilizarla desde otro. En esta hemos introducido todos los metodos que utilizaremos en el 
programra: mostrar lista usuarios, eliminar usuario...


En cuanto al css, investigando he utilizado bootstrap.
	
