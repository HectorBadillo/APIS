<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mensajes</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
            rel="stylesheet" 
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
            crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
            crossorigin="anonymous"></script>
</head>

<body>

    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Nuevo Correo</button>

    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                
                <form action="${pageContext.request.contextPath}/email/enviar" method="POST">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Nuevo Correo</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        
                        <div class="mb-3">
                            <label class="col-form-label">Destinatario:</label>
                            <input type="email" class="form-control" name="destino" required>
                        </div>
                        <div class="mb-3">
                            <label>Asunto:</label>
                            <input type="text" class="form-control" name="asunto" required>
                        </div>
                        <div class="mb-3">
                            <label>Ingrese el Mensaje:</label>
                            <textarea class="form-control" name="texto" rows="3" required></textarea>
                        </div>
                        
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                        <button type="submit" class="btn btn-primary" name="enviar">Enviar</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

</body>
</html>
