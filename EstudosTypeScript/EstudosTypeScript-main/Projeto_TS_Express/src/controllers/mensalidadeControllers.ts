import { Request, Response } from "express";
import Logger from "../../config/logger";
import { mensalidadeModel } from "../models/Mensalidade";


export async function findMensalidadeById(req: Request, res: Response) {
  try {
      
    const id = req.params.id
    const mensalidade = await mensalidadeModel.findById(id)

    if (!mensalidade) {
      return res.status(404).json({ error: "A Mensalidade não existe." });
      
    }

    return res.status(200).json(mensalidade);
  } catch (e: any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }
}

export async function getAllMensalidades(req:Request,res:Response){

  try {
    
    const mensalidades = await mensalidadeModel.find()
    
    return res.status(200).json(mensalidades)
  } catch (e:any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }

}

export async function updateMensalidade(req:Request,res:Response){

  try {
    const id = req.params.id
    const data = req.body
    const mensalidade = await mensalidadeModel.findById(id);

    if(!mensalidade){
      return res.status(404).json({error: "A mensalidade buscada não existe, tente novamente"})
    }
    
    await mensalidadeModel.updateOne({_id: id},data)
    return res.status(200).json(data)
    
    
  } catch (e:any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }
}