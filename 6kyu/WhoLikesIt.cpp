std::string likes(const std::vector<std::string> &names)
{
        switch (names.size()){

        case 0: return "no one likes this";
            break;
        case 1: return names.at(0) + " likes this";
            break;
        case 2: return names.at(0) + " and " + names.at(1) + " like this";
            break;
        case 3: return names.at(0) + ", " + names.at(1) + " and " + names.at(2) + " like this"; 
            break;
        default: return names.at(0) + ", " + names.at(1) + " and " + std::to_string(names.size() - 2) + " others" + " like this";
            break;
    }
}