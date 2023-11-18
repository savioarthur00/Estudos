import {body} from "express-validator"

export const movieCreateValidation = () =>{
    return [
        body("title").isString().withMessage("Titulo obrigatório"),
        body("rating").isNumeric().withMessage("A nota precisa ser um número")
        .custom((value:number)=>{
            
            if(value < 0 || value >10){
                throw new Error("Nota somente entre 0 e 10")
            }
            return true
        }),
        body("description").isString().withMessage("Descrição obrigatória"),
        body("director").isString().withMessage("Diretor obrigatório"),
        body("poster").isURL().withMessage("Imagem deve ser uma URL")

    ]
}